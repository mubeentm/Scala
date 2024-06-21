//'object' is a singleton instance that is lazily
//when it is first accessed. It is similar class but only one
//instance will be created automatically
object helloworld{
  //main is entry point to any scala application
  //unit defines the return type of 'main' indicating that it
  def main(args : Array[String]): Unit = {
    println("Hello World")
  }
}