name := """YumeNote"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
//  jdbc,
//  cache,
//  ws,
  "ws.securesocial" %% "securesocial" % "3.0-M3",
  "com.typesafe.play" %% "play-slick" % "0.8.1"


)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

