package com.krisdrum.flink.source

import java.net.URL

import org.apache.flink.api.scala.{DataSet, ExecutionEnvironment}
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.scala._

trait FlinkSource extends Inputs{
  val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment
  val envStr: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment

  val fileStreamSource: DataStream[String] = envStr.readTextFile(pathHardcoded)
  val fileSource: DataSet[String] = env.readTextFile(pathHardcoded)
}

