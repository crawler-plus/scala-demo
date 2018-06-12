package site.it4u.c02

object SimpleObject {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    person.age = 30
    println(person.name + ".." + person.age)
    println(person.eat)
    person.watchFootball("Barcelona")
    person.printInfo()
  }
}

class People {
  // 定义属性
  var name:String = _ // 占位符推断不了类型，不能省略类型
  var age = 10 // 可以省略类型

  private [this] val gender = "male" // private [this] 只能在class内部访问

  def printInfo(): Unit = {
    println("gender: " + gender)
  }

  def eat():String = {
    name + " is eating..."
  }

  def watchFootball(teamName:String): Unit = {
    println(name + " is watching match of " + teamName)
  }
}
