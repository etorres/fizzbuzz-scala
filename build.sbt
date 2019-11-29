name := "fizzbuzz-scala"

organization := "es.eriktorr.katas"

version := "0.1"

scalaVersion := "2.13.1"

val ScalaTestVersion = "3.0.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % ScalaTestVersion % Test,
  "org.scalactic" %% "scalactic" % ScalaTestVersion % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.2" % Test
)

logBuffered in Test := false
