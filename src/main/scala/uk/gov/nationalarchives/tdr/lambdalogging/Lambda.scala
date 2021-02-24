package uk.gov.nationalarchives.tdr.lambdalogging

import java.util

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}
import com.typesafe.scalalogging.Logger
import org.slf4j.MarkerFactory


class Lambda extends RequestHandler[java.util.Map[String, String], String] {
  val logger: Logger = Logger[Lambda]

  override def handleRequest(input: util.Map[String, String], context: Context): String = {
    logger.info("Info-level hello")
    logger.warn("Warn-level hello")
    logger.error("Error-level hello")

    logger.error("How are errors logged?", new RuntimeException("just testing how a stacktrace is logged"))

    val marker = MarkerFactory.getMarker("markerName")
    logger.info(marker, "some info message with a marker")

    "This is the Lambda return value"
  }
}
