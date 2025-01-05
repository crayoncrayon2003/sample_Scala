object FunctionExample {
  def main(args: Array[String]): Unit = {
    val sec1 = toSeconds(12, 34, 56)
    println(sec1)
  }

  def toSeconds(hour: Int, min: Int, sec: Int): Int = {
    val answer = hour * 3600 + min * 60 + sec
    answer
  }
}
