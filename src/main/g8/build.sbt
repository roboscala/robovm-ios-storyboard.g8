iOSRoboVMSettings

name := "$name$"

robovmConfiguration := Left(file("robovm.xml"))

robovmProperties := Right(Map(
	"app.version" -> version.value,
	"app.id" -> "$appidentifier$",
	"app.mainclass" -> (mainClass in Compile).value.getOrElse(""),
	"app.executable" -> "$name;format="Camel"$",
	"app.build" -> "1",
	"app.name" -> name.value
))

libraryDependencies ++= Seq(
	"org.robovm" % "robovm-cocoatouch" % RoboVMVersion,
	"org.robovm" % "robovm-rt" % RoboVMVersion
)
