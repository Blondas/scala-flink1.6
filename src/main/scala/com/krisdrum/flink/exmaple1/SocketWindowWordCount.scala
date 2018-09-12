//package com.krisdrum.flink.exmaple1

import org.apache.flink.api.java.utils.ParameterTool
import org.apache.flink.streaming.api.scala.{StreamExecutionEnvironment}
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.time.Time

//object SocketWindowWordCount extends App {
//  import Time._
//
//  val port = ParameterTool.fromArgs(args).getInt("port")
//  val env = StreamExecutionEnvironment.getExecutionEnvironment
//
//  val text: DataStream[String] = env.socketTextStream("localhost", port, '\n')
//
//  val windowCounts = text
//    .flatMap(_.split("\\s") )
//    .map(WordWithCount(_, 1) )
//    .keyBy("word")
//    .timeWindow(seconds(5), seconds(1))
//    .sum("count")
//
//}

//case class WordWithCount(word: String, count: Long)