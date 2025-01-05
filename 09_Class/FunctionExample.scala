class AAA(private var name: String, private var age: Int) {

  def setName(name: String): Unit = {
    this.name = name
  }

  def getName: String = {
    this.name
  }

  def myOverride(): Unit = {
    println("Hello")
  }

  def myOverload(name: String): Unit = {
    this.name = name
  }
}

class BBB(name: String) extends AAA("Cat", 0) {

  setName(name)

  override def myOverride(): Unit = {
    println("Hello Hello!")
  }

  def myOverload(name: String, age: Int): Unit = {
    setName(name)
  }
}

object FunctionExample {
  def main(args: Array[String]): Unit = {
    val objAAA = new AAA("I am AAA", 10)
    val objBBB = new BBB("I am BBB")

    objAAA.myOverride()
    objBBB.myOverride()

    objAAA.myOverload("I am CCC")
    objBBB.myOverload("I am CCC", 30)

    println(objAAA.getName)
    println(objBBB.getName)
  }
}
