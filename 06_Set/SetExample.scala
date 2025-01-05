import scala.collection.mutable.HashSet

object SetExample {
  def main(args: Array[String]): Unit = {
    println("----- set -----")
    val set = HashSet[String]()

    set += "Red"
    set += "Green"
    set += "Blue"

    println("----- before -----")
    for (item <- set) {
      println(item)
    }

    set -= "Green"

    println("----- after -----")
    for (item <- set) {
      println(item)
    }
  }
}
