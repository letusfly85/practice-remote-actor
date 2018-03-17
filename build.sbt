name := "practice-remote-actor"

version := "0.0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= {
  val akkaV        = "2.5.11"
  Seq(
    "com.typesafe.akka" %% "akka-remote"             % akkaV
  )
}
