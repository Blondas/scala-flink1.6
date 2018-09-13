package com.krisdrum.flink.keyBy

import com.krisdrum.flink.source.Environments
import org.apache.flink.streaming.api.scala._


trait KeyBy extends Environments {
  val list = List(A("a",1),A("a",2),A("b",1),A("b",1))
  senv
    .fromCollection(list)
    .keyBy(e=>e)
    .print()
  senv.execute()
}
case class A(a: String, b: Int)
object TestApp extends KeyBy with App
