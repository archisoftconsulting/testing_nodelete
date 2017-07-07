name := """b2b-play-service"""

version := "latest"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

//libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs
// https://mvnrepository.com/artifact/com.netflix.eureka/eureka-client
libraryDependencies += "com.netflix.eureka" % "eureka-client" % "1.7.0" % "runtime"



// Compile the project before generating Eclipse files, so that generated .scala or .class files for views and routes are present
EclipseKeys.preTasks := Seq(compile in Compile)

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes
