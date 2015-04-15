Nice.javaProject

name := "bio4j-json"

organization := "bio4j"

description := "Bio4j JSON serialization related classes for Java programs"

bucketSuffix := "era7.com"

javaVersion := "1.8"

libraryDependencies ++= Seq(
  "bio4j" % "bio4j-titan" % "0.4.0-SNAPSHOT",
  "com.google.code.gson" % "gson" % "2.2.4"
)

dependencyOverrides ++= Set(
  "commons-codec" % "commons-codec" % "1.7",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.1.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.1.2",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.1.1",
  "commons-beanutils" % "commons-beanutils" % "1.8.3",
  "commons-beanutils" % "commons-beanutils-core" % "1.8.3"
)



