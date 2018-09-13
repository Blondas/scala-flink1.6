package com.krisdrum.flink.source

import org.apache.flink.api.scala.ExecutionEnvironment
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

trait Environments {
  val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment
  val senv: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment

}
