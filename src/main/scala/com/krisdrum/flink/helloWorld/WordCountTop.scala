package com.krisdrum.flink.helloWorld

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.api.common.operators.Order
import org.apache.flink.streaming.api.scala._


object WordCountTop extends FlinkSource with App {

  fileSource
    .flatMap(_.split("\\W+"))
    .map(_ -> 1)
    .groupBy(0)
    .sum(1)
    .sortPartition(1, Order.DESCENDING)
    .setParallelism(1)
    .first(10)
    .print()
}
