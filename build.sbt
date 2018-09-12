name := "scala-flink1.6"

version := "0.1"

scalaVersion := "2.11.12"
val flinkVer = "1.6.0"

libraryDependencies += "org.apache.flink" % "flink-scala_2.11" % flinkVer
libraryDependencies += "org.apache.flink" % "flink-streaming-scala_2.11" % flinkVer
libraryDependencies += "org.apache.flink" % "flink-clients_2.11" % flinkVer
