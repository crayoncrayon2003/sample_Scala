object ForAndWhile {
  def main(args: Array[String]): Unit = {
    for (idx <- 0 until 10) {
      println(s"idx = $idx")
    }

    var cnt = 1
    while (cnt < 5) {
      println(s"cnt = $cnt")
      cnt += 1
    }
  }
}
