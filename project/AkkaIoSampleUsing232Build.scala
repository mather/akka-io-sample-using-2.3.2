import sbt._
import sbt.Keys._

object AkkaIoSampleUsing232Build extends Build {

  lazy val akkaIoSampleUsing232 = Project(
    id = "akka-io-sample-using-2_3_2",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka IO Sample using 2.3.2",
      organization := "com.github.mather",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.3",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.2"
    )
  )
}
