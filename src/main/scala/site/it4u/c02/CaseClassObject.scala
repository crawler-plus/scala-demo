package site.it4u.c02

// 通常用在模式匹配
object CaseClassObject {
  def main(args: Array[String]): Unit = {
    println(Dog("wangwang").name)
  }
}

// case class不用new
case class Dog(name:String)