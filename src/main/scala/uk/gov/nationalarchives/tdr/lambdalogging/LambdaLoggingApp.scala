package uk.gov.nationalarchives.tdr.lambdalogging

import com.amazonaws.services.lambda.runtime.{ClientContext, CognitoIdentity, Context, LambdaLogger}

object LambdaLoggingApp extends App {
  val lambda = new Lambda

  val input = new java.util.HashMap[String, String]()
  val context = new FakeLambdaContext

  lambda.handleRequest(input, context)
}

class FakeLambdaContext extends Context {
  override def getAwsRequestId: String = "fake request ID"
  override def getLogGroupName: String = "fake log group ID"
  override def getLogStreamName: String = "fake log stream name"
  override def getFunctionName: String = "fake function name"
  override def getFunctionVersion: String = "fake function version"
  override def getInvokedFunctionArn: String = "fake invoked function ARN"
  override def getIdentity: CognitoIdentity = null
  override def getClientContext: ClientContext = null
  override def getRemainingTimeInMillis: Int = 0
  override def getMemoryLimitInMB: Int = 0
  override def getLogger: LambdaLogger = null
}
