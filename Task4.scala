import scala.io.Source
object Task4{
  def main(args : Array[String]) : Unit ={
    val filepath = "C:\\Users\\Administrator\\Downloads\\stategdp.csv"
    //Read the file from path
    val source = Source.fromFile(filepath)
    //to skip the header line
    val lines = source.getLines().drop(1)

    var maxGdp = 0.0
    var maxGdpState = ""
    var totalPercapitaincome = 0.0
    var totalGdp = 0.0
    var noofstate = 0
    for ( line <- lines){
      val columns = line.split(",").map(_.trim)
//      columns.foreach(println)
      if (columns.length == 3){
      val state = columns(0)
      val gdp = columns(1).toDouble
      val percapita = columns(2).toDouble

      //finding max GDP
      if (gdp > maxGdp){
        maxGdp = gdp
        maxGdpState = state
      }
      totalPercapitaincome += percapita
      totalGdp += gdp
      noofstate += 1
    }
    }
    //finding average percapita
    val averagepercapita = totalPercapitaincome / noofstate

    println(s"State with maximum GDP : $maxGdpState with a GDP of Rs. $maxGdp (Billion)")
    println(s"Average Percapita income : Rs. $averagepercapita (Billion)")
    println(s"Total GDP of Indian States and UT : Rs. $totalGdp (Billion)")
  }
}