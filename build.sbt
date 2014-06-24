organization := "com.github.mather"

name := "akka-io-sample-using-2_3_2"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.3"

scalacOptions := Seq("-deprecation", "-feature")

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.2" % "test"
)
