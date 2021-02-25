# TDR JSON logging prototype

This is a prototype app designed to be run on AWS Lambda. It demonstrates how to configure a Scala application to write
JSON-formatted logs.

It was built to help us work out how to save logs on the [Transfer Digital Records] project.

The application just writes logs at a variety of log levels. Some log messages include exceptions, and some include
extra custom fields.

It uses the [logstash-logback-encoder] to write the logs as JSON. See the logback.xml for the JSON log configuration.

[Transfer Digital Records]: https://github.com/nationalarchives/tdr-dev-documentation/
[logstash-logback-encoder]: https://github.com/logstash/logstash-logback-encoder

## Run the project locally

Run `sbt run`, or run the `LambdaLoggingApp` object in IntelliJ.

## Run the project on AWS Lambda

* Run `sbt assembly`, which generates a file at `target/scala-2.13/example-lambda-logging.jar`
* Create a new Lambda function in AWS which uses the Java runtime
* Upload the jar file to the Lambda
* Create a test event to send to the Lambda - the app doesn't actually use this event, so the contents can be anything.
  The default 'Hello world' message is fine.
* Send the test event to the Lambda
* Inspect the logs in the CloudWatch log group
