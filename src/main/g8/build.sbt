import AssemblyKeys._

name := "$name$"

version := "$version$"

organization := "$organization$"

scalaVersion := "$scala_version$"

org.scalastyle.sbt.ScalastylePlugin.Settings

org.scalastyle.sbt.PluginKeys.config <<= baseDirectory {_ / "conf" / "scalastyle-config.xml" }

libraryDependencies ++= Seq(
	"org.slf4j" % "slf4j-api" % "1.7.5",
	"ch.qos.logback" % "logback-core" % "1.0.13",
	"ch.qos.logback" % "logback-classic" % "1.0.13",
	"org.scalatest" % "scalatest_2.10" % "2.0" % "test"
)

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")

// fullRunTask(InputKey[Unit]("run-main-args"), Compile, "$organization$.$name;format="Camel"$")

// fullRunInputTask(InputKey[Unit]("run-main"), Compile, "$organization$.$name;format="Camel"$")

assemblySettings

jarName in assembly := "$name;format="Camel"$.jar"

mainClass in assembly := Some("$organization$.$name;format="Camel"$")