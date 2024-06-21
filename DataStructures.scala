//Collection in Scala programming
object DataStructures {
  def main (args : Array[String]): Unit = {
   //List : Immutable, Homogeneous Collection of Data
   val fruits : List[String] = List("apple", "oranges", "watermelon", "grapes", "guava")
    println("First Element : " + fruits.head)
    println("Values Excluding First Element : "+fruits.tail)
    println("Last Element : "+fruits.last)

    val list1 = List("Hadoop", "Spark", "Flume", "Pyspark", true , 10000, 3.1243)
    println(list1)
    println(fruits.getClass)

    //Empty List Declaration
    val emptyList: List[Nothing] = List()
    //List declaration
    val List2 = 10::20::30::40::Nil
    //Create a list Buffer of type mutable
   import scala.collection.mutable.ListBuffer
   var cities = new ListBuffer[String]()
   cities += "Thiruvananthapuram"
   cities += "Bengaluru"
   cities += ("Mumbai", "Delhi","Pune")
   cities -= "Mumbai"
   cities.toList
   println(cities)



    //Array  DataType : Array is Mutable, fixed size collection
    //Array i sHomogenous collection
    val arrayData = Array("apple", "oranges", "watermelon", "grapes", "guava")
    //print element by element output in new line
    arrayData.foreach(println)
   //prints all values
   println(arrayData.mkString(","))
   arrayData(0) = "banana"
   println(arrayData.mkString(","))

   //Declaring an empty array
   var arr_1 = new Array[String](10)
   //Declare a 2-dim Array
   var arr_2 = Array.ofDim[Int](2,2)
   arr_2(0)(0) = 234
   arr_2(0)(1) = 135
   arr_2(1)(0) = 911
   arr_2(1)(1) = 102

   //Print the array
   //flatten - Multidimension to single dimension
  val flattenArray : Array[Int] = arr_2.flatten
   println(flattenArray.mkString(","))

   //Updating 2-D Array
   arr_2(0)(1) = 369

 //set collections : Immutable collection
   //HashSet - Mutable collection of sets
//   val set_1 : set[String] = set()

   val set_2 = Set("apple", "oranges", "watermelon", "grapes", "guava")

   import scala.collection.mutable.Set
//   val mutableSet = set("apple", "oranges", "watermelon", "grapes", "guava")
//   mutableSet += "blueberry"
//   mutableSet -= "apple"

   //Tuple Declaration
   //In scala tuple is fixed size , can hold multiple datatypes
   val Tuple_1 = (10, 20, 30, 40, 50, 60, 70, 80)
   //Tuple_1._1 = "String" Update will provide error.
   println(Tuple_1._2)//Accessing individual value ie. second element

   //Mp in scala is a collection of key_value pair where
   //each key is unique, It is similar to Dictionary in python

//   import scala.collection.immutable.Map

   //Empty variable declaration
   var MapVar : Map[String, Int] = Map()
   var MapVar1 = Map("UST1001" -> "Sandeep", "UST1002" -> "Mithun", "UST1003" -> "Vinesh", "UST1004" -> "Adhnan")
   println(MapVar1.contains("UST1002"))//contains return true and false
   //Assess value using keys
   println(MapVar1.get("UST1002"))
   //print all keys
   println(MapVar1.keys)
   //print all values
   println(MapVar1.values)

   //Declare mutable map
   import scala.collection.mutable.Map
   var mutable_Var = Map("UST1001" -> "Sandeep", "UST1002" -> "Mithun", "UST1003" -> "Vinesh", "UST1004" -> "Adhnan")
   //Update existing key
   mutable_Var("UST1001") = "Rohit"
   //Insert a new key-value pair
   mutable_Var += ("UST1005" -> "Siva")

   //Iterators in scala programming
   //An iterator in scala represent a sequence of elements
   //that allows you to traverse through a collection sequentially
   val my_list = List(20,30,40,50,60,70,80,90)
   val iter = my_list.iterator
   //Method of iterator to check if there is more elements (.hasNext())
   // .next() - to retrieve next value
   // .remove()- to remove elements from mutable iterators
   println(iter.next())
   //lazy initialization using scala
   lazy val donuts : Int = 100
   println(donuts * 5)
   //lazy cant be used in var
   //lazy var donut_1 : Int = 20
   
  }

}
