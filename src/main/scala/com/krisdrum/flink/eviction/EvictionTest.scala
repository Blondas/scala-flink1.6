package com.krisdrum.flink.eviction

import java.lang

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.assigners.GlobalWindows
import org.apache.flink.streaming.api.windowing.evictors.Evictor
import org.apache.flink.streaming.api.windowing.triggers.CountTrigger
import org.apache.flink.streaming.runtime.operators.windowing.TimestampedValue


object EvictionTest extends FlinkSource with App {
//  intIncStreamSource
//    .windowAll(GlobalWindows.create())
//    .trigger(CountTrigger.of(10))
//    .evictor(new Evictor[Int] {
//      override def evictBefore(elements: lang.Iterable[TimestampedValue[Int]], size: Int, window: W, evictorContext: Evictor.EvictorContext): Unit = ()
//
//      override def evictAfter(elements: lang.Iterable[TimestampedValue[Int]], size: Int, window: W, evictorContext: Evictor.EvictorContext): Unit = ()
//    })
}
