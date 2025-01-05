object ArrayAndList {
  def main(args: Array[String]): Unit = {
    println("----- array -----")
    val array = Array("Red", "Green", "Blue")
    println(array(0))
    println(array(1))
    println(array(2))

    for (idx <- array.indices) {
      println(array(idx))
    }

    println("----- list -----")
    val list = scala.collection.mutable.ListBuffer[String]()

    list += "Red"
    list += "Green"
    list += "Blue"

    println("----- before -----")
    for (item <- list) {
      println(item)
    }

    list -= "Green"

    println("----- after -----")
    for (item <- list) {
      println(item)
    }
  }
}
