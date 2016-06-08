name         := "Spark Simple App"
version      := "1.0"
organization := "pl.sarlindo"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
resolvers += Resolver.mavenLocal
