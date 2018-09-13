package com.krisdrum.flink.iterativeStream

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.streaming.api.scala._


object IterativeStream extends FlinkSource with App{
  /*
  idea of iterative stream:

  val iteratedStream = someDataStream.iterate(
  iteration => {
    val iterationBody = iteration.map(/* this is executed many times */)
    (iterationBody.filter(
      /* one part of the stream */),
      iterationBody.filter(/* some other part of the stream */)
    )
  })
   */

  intIncStreamSource
    .iterate(iteration => {
      val minusOne = iteration.map(_-1)
      (minusOne.filter(_ > 0).setParallelism(1), minusOne.filter(_ <= 0)) // (conditionIterateAgain, conditionDone)
    })
    .print()
  senv.execute()
}
