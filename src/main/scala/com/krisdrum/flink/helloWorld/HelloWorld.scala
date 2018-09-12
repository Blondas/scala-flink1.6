package com.krisdrum.flink.helloWorld

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.api.scala.DataSet
import org.apache.flink.streaming.api.scala._

object HelloWorld extends App with FlinkSource {
  // stream from collection:
  val collectionSource: DataSet[String] = env.fromCollection(seq)
  collectionSource.print()

  // stream from file:
  fileSource.print()
}
