package site.it4u.c05

/**
  * 函数可以命名，也可以不命名
  */
object FunctionObject extends App {

  def sayHello(name:String): Unit = {
    println(s"hi:$name")
  }

  // 匿名函数
  val m = (x:Int) => x + 1
  println(m(7))

  def add = (x:Int, y:Int) => println(x + y)
  add(6,7)

  def sum(a:Int, b:Int) = a + b
  println(sum(3,4))

  // 柯里化
  def sum2(a:Int)(b:Int) = a + b
  println(sum2(4)(7))

  println("----------------------")

  val l = List(1,2,3,4,5,6,7,8)
  // map 逐个去操作集合中的每个元素
  val plusMap = l.map(t => t + 1)
  println(plusMap)
  val xxMap = l.map(t => t*2)
  println(xxMap)
  val yyMap = l.map(_*4) // _代表每一个元素
  println(yyMap)
  l.map(_ *2).foreach(println)

  println("------------------------")
  // filter (过滤)
  l.map(_*2).filter(_>8).foreach(println)
  // take
  println(l.take(4))
  // reduce
  val reduceSum = l.reduce(_+_) // 两两相加
  println(reduceSum)
  val reduceLeft = l.reduceLeft(_+_)
  println(reduceLeft)
  val f = List(List(1,2), List(3,4))
  val flattenedF = f.flatten // 压扁
  println(flattenedF)
  // flatMap
  val g = f.flatMap(_.map(_*2)) // 相当于flatten再map
  println(g)

  println("-------------------------")

}
