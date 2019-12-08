// exclude is a workaround for https://github.com/sbt/sbt-assembly/issues/236#issuecomment-294452474
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6" exclude("org.apache.maven", "maven-plugin-api"))

addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.27")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin-shaded" % "0.9.4"

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.4.31")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.1")

addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "0.6.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.31")

addSbtPlugin("org.scala-debugger" % "sbt-jdi-tools" % "1.1.1")
