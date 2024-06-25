object ProductFilter{
  def main (args : Array[String]) : Unit = {
    val product = List(("Bread", 40.0, 0.05, 6),
      ("Milk", 40.0, 0.05, 3),
      ("Butter", 70.0, 0.1, 5),
      ("Sugar", 55.0, 0.08, 3),
      ("Meat", 50.0, 0.04, 7)
    )
    for (value <- product) {
      if (value._2 > 50.0) {
        println(s"${value._1}")
      }
    }
    for (value <- product) {
      val total = (value._2-(value._2 * value._3/100)) * value._4
      println(s"Total price for ${value._1} is $total")
//      println("Total price for "+ value._1 +" is "+total)
    }
    for (value <- product) {
      val total = (value._2-(value._2 * value._3/100)) * value._4
//      println(s"Total price for ${value._1} is $total")
      //      println("Total price for "+ value._1 +" is "+total)
      if (total>300){
        println(s"${value._1}")
      }

    }

    //      print(s"${value._2}*${value._4}")
  }
}