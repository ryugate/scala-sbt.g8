import AssemblyKeys._

name := "$name$"

version := "$version$"

organization := "$organization$"

scalaVersion := "$scala_version$"

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.config <<= baseDirectory {_ / "conf" / "scalastyle-config.xml" }

jarName in assembly := "$name$.jar"

mainClass in assembly := Some("$organization$.$name$")

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")

libraryDependencies ++= Seq(
	"org.slf4j" % "slf4j-api" % "1.7.5",
	"ch.qos.logback" % "logback-core" % "1.0.13",
	"ch.qos.logback" % "logback-classic" % "1.0.13"
)

// fullRunTask(InputKey[Unit]("run-main-args"), Compile, "jp.ryugate.xxx")

// fullRunInputTask(InputKey[Unit]("run-main"), Compile, "jp.ryugate.xxx")
