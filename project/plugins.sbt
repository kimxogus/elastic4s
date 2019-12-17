resolvers += Classpaths.sbtPluginReleases

//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

//addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

resolvers += Resolver.jcenterRepo
addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.19.0")
