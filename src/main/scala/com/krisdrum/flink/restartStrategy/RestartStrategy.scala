package com.krisdrum.flink.restartStrategy

import java.util.concurrent.TimeUnit

import com.krisdrum.flink.source.Environments
import org.apache.flink.api.common.restartstrategy.RestartStrategies
import org.apache.flink.api.common.time.Time

trait RestartStrategy extends Environments{
  senv.setRestartStrategy(RestartStrategies.fixedDelayRestart(3, Time.of(10, TimeUnit.SECONDS)))
}
