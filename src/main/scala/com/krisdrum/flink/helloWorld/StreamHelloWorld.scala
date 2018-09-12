package com.krisdrum.flink.helloWorld

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.streaming.api.scala._


object StreamHelloWorld extends App with FlinkSource {
  val collectionSource = envStr.fromCollection(seq)
  collectionSource.print()

  fileStreamSource.print()

  envStr.execute()
}
