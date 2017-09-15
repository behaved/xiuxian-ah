name := """xiuxian-ah"""
organization := "xiuxian"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "xsad.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "xsad.binders._"
