
name := "example-lambda-logging"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "net.logstash.logback" % "logstash-logback-encoder" % "6.6",

  "com.amazonaws" % "aws-lambda-java-core" % "1.2.1"
)

assemblyJarName in assembly := "example-lambda-logging.jar"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
