package site.it4u.c02

object AbstractObject {
  def main(args: Array[String]): Unit = {
    val p = new ConcretePerson2
    p.speak
  }
}

/**
  * 定义一个抽象类
  */
abstract class Person2 {

  def speak

  val name:String
  val age:Int
}

class ConcretePerson2 extends Person2 {
  override def speak: Unit = {
    println("speak")
  }
  override val name: String = "it4u"
  override val age: Int = 10
}