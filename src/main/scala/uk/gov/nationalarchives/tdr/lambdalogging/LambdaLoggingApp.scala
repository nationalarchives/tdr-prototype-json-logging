package uk.gov.nationalarchives.tdr.lambdalogging

import com.typesafe.scalalogging.Logger

object LambdaLoggingApp extends App {
  val logger: Logger = Logger[LambdaLoggingApp.type]

  logger.info("Info-level hello")
  logger.warn("Warn-level hello")
  logger.error("Error-level hello")
}
