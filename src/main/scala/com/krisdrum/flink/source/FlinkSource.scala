package com.krisdrum.flink.source

import org.apache.flink.api.scala.DataSet
import org.apache.flink.streaming.api.scala._

trait FlinkSource extends Inputs with Environments{
  val fileStreamSource: DataStream[String] = senv.readTextFile(pathHardcoded)
  val fileSource: DataSet[String] = env.readTextFile(pathHardcoded)


  val intIncStreamSource: DataStream[Int] = senv.fromCollection(1 to 100  take 2)
}

