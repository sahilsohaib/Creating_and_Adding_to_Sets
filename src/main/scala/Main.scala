object SetExample {
  def main(args: Array[String]): Unit = {
    var mySet = Set.empty[String]

    println("Welcome to the Set program!")
    var continue = true

    while (continue) {
      println("\nCurrent Set: " + mySet.mkString(", "))

      println("\nMenu:")
      println("1. Add an element to the Set")
      println("2. Exit")

      print("Select an option (1/2): ")
      val choice = scala.io.StdIn.readLine()

      choice match {
        case "1" =>
          print("Enter an element to add: ")
          val element = scala.io.StdIn.readLine()
          mySet += element

        case "2" =>
          println("Goodbye!")
          continue = false

        case _ =>
          println("Invalid choice. Please select a valid option.")
      }
    }
  }
}
