name := "example-lambda-logging"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  // TODO: Not the latest version
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  // TODO: This is old - is there a newer alternative?
  "ch.qos.logback.contrib" % "logback-json-classic" % "0.1.5",
  "ch.qos.logback.contrib" % "logback-jackson" % "0.1.5",
  // TODO: Not the latest version
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.3"
)
