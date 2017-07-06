import AssemblyKeys._

assemblySettings

name := "SBTBuildTest"

version := "1.0"

scalaVersion := "2.12.2"

jarName in assembly := "hello.jar"

mainClass in (Compile, assembly) := Some("com.whiteboardcoder.hello.hw")