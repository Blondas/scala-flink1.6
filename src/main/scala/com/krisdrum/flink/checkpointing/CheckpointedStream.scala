package com.krisdrum.flink.checkpointing

import com.krisdrum.flink.source.FlinkSource
import org.apache.flink.streaming.api.CheckpointingMode
import org.apache.flink.streaming.api.scala._

object CheckpointedStream extends App with FlinkSource{
  senv.enableCheckpointing(1000, CheckpointingMode.AT_LEAST_ONCE)
}
