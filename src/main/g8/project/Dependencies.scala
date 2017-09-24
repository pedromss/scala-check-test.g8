import sbt._
import sbt.Keys._

object Dependencies {

  private lazy val scalaTest = "org.scalatest" %% "scalatest" % "$scala_test_version$" % Test 
  private lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "$scala_check_version$" % Test

  lazy val root = Seq(
    scalaTest, scalaCheck
  )
}
