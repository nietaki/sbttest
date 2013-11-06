name := "woen1"

version := "0.1"


libraryDependencies  ++= Seq(
            // other dependencies here
            // pick and choose:
            //"org.scalanlp" %% "breeze-math" % "0.2",
            //"org.scalanlp" %% "breeze-learn" % "0.2",
            //"org.scalanlp" %% "breeze-process" % "0.2",
            //"org.scalanlp" %% "breeze-viz" % "0.2"
)

//libraryDependencies += "org.scalautils" % "scalautils_2.10" % "2.0"
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"


resolvers ++= Seq(
            // other resolvers here
            // if you want to use snapshot builds (currently 0.3-SNAPSHOT), use this.
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

scalaVersion := "2.10.3"
