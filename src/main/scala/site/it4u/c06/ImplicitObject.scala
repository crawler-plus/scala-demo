package site.it4u.c06

import java.io.File
import ImplicitAspect._  // 全部引入隐式转换implicit

object ImplicitObject extends App {

  val man = new Man("it4u")
  man.eat()
  man.fly()

  val file = new File("hello.txt")
  val txt = file.read()
  println(txt)

  def testParam(implicit name:String): Unit = {
    println(s"$name~~~~~~~~~~~")
  }
  testParam("zs")
  implicit val name = "implicit_name"
  testParam // 不用传参数，因为能够找到到一个string类型的name
}


class Man(val name:String) {
  def eat(): Unit = {
    println(s"man: $name can eat......")
  }
}

class Superman(val name:String) {
  def fly(): Unit ={
    println(s"superman: $name can fly......")
  }
}

class RichFile(val file:File) {
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }
}
