object Vowels {
  def main(args : Array[String]): Unit = {
    val tArray = Array("andra","bihar","canada","delhi","ernakulam","france","goa","himalaya")
    val vowcons = tArray.groupBy{ values =>
      if ("aeiou".contains(values.charAt(0))) "Vowel" else "consonent"
    }
    vowcons.foreach {
      case (key, value) => println(s"$key: ${value.mkString(", ")}")
    }
  }
}