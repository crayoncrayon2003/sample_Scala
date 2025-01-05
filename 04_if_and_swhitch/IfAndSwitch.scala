object IfAndSwitch {
  def main(args: Array[String]): Unit = {
    println(" if ")
    for (idx <- 0 until 10) {
      if (idx % 2 == 0) {
        println(s"$idx % 2 == 0")
      } else if (idx % 3 == 0) {
        println(s"$idx % 3 == 0")
      } else {
        println(s"$idx")
      }
    }

    println(" switch ")
    for (idx <- 0 until 10) {
      idx match {
        case 1 => println("One")
        case 2 => println("Two")
        case 3 | 4 => println("Three or Four")
        case _ => println("Other")
      }
    }
  }
}
