import scala.collection.mutable.HashMap

object MapExample {
  def main(args: Array[String]): Unit = {
    val map = HashMap[Int, String]()

    map.put(1, "Red")
    map.put(2, "Green")
    map.put(3, "Green")
    map.put(4, "Blue")

    println("----- before -----")
    for ((key, value) <- map) {
      println(s"$key: $value")
    }

    map.remove(2)

    println("----- after -----")
    for ((key, value) <- map) {
      println(s"$key: $value")
    }
  }
}
