package com.krisdrum.flink.windows

import com.krisdrum.flink.helloWorld.WordCountTop.fileSource
import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.api.common.operators.Order
import org.apache.flink.streaming.api.functions.sink.PrintSinkFunction
import org.apache.flink.streaming.api.scala.DataStream
import org.apache.flink.streaming.api.windowing.assigners.{GlobalWindows, ProcessingTimeSessionWindows, SlidingEventTimeWindows, TumblingEventTimeWindows}
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.time.Time

object Windows extends FlinkSource with App {
  val data = fileStreamSource.flatMap(_.split("\\W+")).map(_ -> 1)
  val stream = fileSource.flatMap(_.split("\\W+")).map(_ -> 1)

  import Time._

  // 1. global window:
  data
    .keyBy(0)
    .window(GlobalWindows.create)
    .sum(1) // window function
    .print()
  envStr.execute()

  // 2. tumbling window - non overlaping:
  data
    .keyBy(0)
    .window(TumblingEventTimeWindows.of(seconds(1)))
    .sum(1) // window function
    .print()
  envStr.execute()

  // 2. sliding window:
  data
    .keyBy(0)
    .window(SlidingEventTimeWindows.of(seconds(10), seconds(5)))
    .sum(1) // window function
    .print()
  envStr.execute()

  // 2. session window - starts at individual point, ends after period of inactivity:
  data
    .keyBy(0)
    .window(ProcessingTimeSessionWindows.withGap(seconds(2)))
    .sum(1) // window function
    .print()
  envStr.execute()
}