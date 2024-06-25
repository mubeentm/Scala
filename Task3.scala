import scala.io.StdIn

object Task3{
//  def checkBalance() = {
//    val balance = 10000
//  }
    def bankingMenu(): Unit = {
      //Create a banking Menu
      //    1.Check Balance
      //    2.Withdraw Amount
      //    3.Deposit
      //    4.Exit
      var balance = 10000
      var continue = true
      println("***Banking Menu***\n1.Check Balance\n2.Withdraw Amount\n3.Deposit\n4.Exit")
      while (continue) {
        println("\nChoose appropriate option ")
        val opt = StdIn.readInt()
        if (opt == 1){
//          println(s"Available Balance : ${checkBalance().balance}")
          println(s"Available Balance : $balance")
        }
        else if (opt == 2){
          print("Enter the amount you want to withdraw : ")
          var withAmount = StdIn.readInt()
//          if (withAmount<=0 ){
//            println("Enter a positive number")
//            var withAmount = StdIn.readInt()
//          }
          if (withAmount <= balance)
           {
             println("Enter the amount to withdraw : ")
             balance = balance - withAmount
             println(s"Available Balance is Rs.$balance")
           }
          else {
           println("insufficient funds")

          }
        }
        else if (opt == 3){
          print("Enter the amount to deposit : ")
          var depAmount = StdIn.readInt()
          if (depAmount >= 0) {
            balance = balance + depAmount
            println(s"New balance : $balance")
          }
          else{
            println("Amount must be positive")
          }

        }
        else if (opt == 4){
          continue = false
        }
        else
          println("Enter number between 1 to 4")
      }
    }
  def main(args : Array[String]) : Unit = {
    bankingMenu()
  }
}