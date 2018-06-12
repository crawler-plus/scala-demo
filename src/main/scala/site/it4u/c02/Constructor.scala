package site.it4u.c02

object Constructor {
  def main(args: Array[String]): Unit = {
    val person = new Person("张三", 30) // 主构造器
    println(person.name, person.age, person.school)
    val person2 = new Person("张三", 30, "M") // 附属构造器
    println(person2.name, person2.age, person2.school, person2.gender)
    val student = new Student("it", 40, "english")
    println(student.name, student.age, student.major)
    println(student)
  }
}

//  主构造器
class Person(val name:String, val age:Int) {
  println("person enter")
  val school = "it4u"
  var gender:String = _
  // 附属构造器(第一行代码必须要调用主构造器或者其他附属构造器）
  def this(name:String, age:Int,gender:String) {
    this(name, age)
    this.gender = gender
  }
  println("person leave")
}

class Student(name:String, age:Int, val major:String) extends Person(name, age) {
  println("student...")

  // 对父类属性和方法进行重写，使用override关键字
  override val school = "mountain"

  // 重写toString方法
  override def toString: String = {
    return "toString from student" + (this.name, this.age, this.major, this.school)
  }
}