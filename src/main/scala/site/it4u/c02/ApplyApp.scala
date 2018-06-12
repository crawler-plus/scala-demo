package site.it4u.c02

object ApplyApp {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10) {
      ApplyTest.incr
    }
    println(ApplyTest.count) // 为10，说明object本身是一个单例对象
    val b = ApplyTest() // 调用的是object中的apply方法
    val c = new ApplyTest()
    println(c)
    c() // 调用的是class中的apply方法
    // 类名() =>object.apply
    // 对象() => class.apply
  }
}

// 伴生类
// 如果有一个class和同名的object，则为伴生类和伴生对象
class ApplyTest {
  def apply() = {
    println("apply class...")
  }
}

// 伴生对象
object ApplyTest {
  var count = 0
  def incr = {
    count = count + 1
  }
  def apply() = {
    println("apply...")
    // 在object中的apply中new class
    new ApplyTest
  }
}
