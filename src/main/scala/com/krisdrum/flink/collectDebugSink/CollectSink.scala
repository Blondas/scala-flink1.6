package com.krisdrum.flink.collectDebugSink

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.streaming.api.datastream.DataStreamUtils
import scala.collection.JavaConverters.asScalaIteratorConverter

object CollectSink extends FlinkSource with App {
  val ret = DataStreamUtils.collect(intIncStreamSource.javaStream).asScala
  println(ret.toList)
  senv execute
}
