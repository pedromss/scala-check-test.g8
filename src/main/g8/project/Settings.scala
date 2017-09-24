import sbt.Keys._

object Settings {

  private lazy val shared = Seq(
    organization := "$organization$",
    scalaVersion := "$scala_version$"
  )

  lazy val root = shared ++ Seq(
    name := "$name$",
    version := "$version$",
    libraryDependencies ++= Dependencies.root
  )
}
