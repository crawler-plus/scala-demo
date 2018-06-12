package site.it4u.c01

// 函数
object FunctionApp {

  def main(args: Array[String]): Unit = {
    println(add(1,2))
    println(three())
    println(three) // 当函数没有入参的时候，（）可以省略
    sayHello
    sayName()
    sayName("haha")
    loadConf()
    loadConf("spark-my.conf")
    println(speed(time = 10F, distance = 40F)) // 命名参数
//    sum(1,2)
    println(sum2(12,3,4,5,6))
    val x = 1
    if(x > 0) {
      println(true)
    }else {
      println(false)
    }
    val a = if(x > 0) true else false
    println(a)
    val b = 1 to 10 // 包含左边也包含右边
    println(b)
    val c = 1.to(10)
    println(c)
    val d = Range(1,10, 3)
    println(d)
    for(i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }
    for(i <- 1 until 10) {
      println(i)
    }
    val courses = Array("java", "scala", "sql")
    for(course <- courses) {
      println(course)
    }
    println("--------------------------")
    courses.foreach(println)
    // 求和
    var (num, sum) = (100, 0)
    while (num > 0) {
      sum = sum + num
      num = num - 1
    }
    println(sum)
  }

  def add(x:Int, y:Int): Int = {
    x + y //  最后一行就是返回值，不需要return
  }

  def three() = 1 + 2

  def sayHello(): Unit = {
    println("say hello")
  }

  // 默认参数
  def sayName(name:String="it4u"): Unit ={
    println(name)
  }

  def loadConf(conf:String="spark-default.conf"): Unit ={
    println(conf)
  }

  def speed(distance:Float,time:Float):Float = {
    distance/time
  }

  def sum(a:Int,b:Int): Int = {
    a + b
  }

  // 可变参数
  def sum2(number:Int*):Int = {
    var result = 0
    for(num <- number) {
      result += num
    }
    result
  }
}
