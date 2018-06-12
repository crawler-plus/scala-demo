package site.it4u.c03

object ArrayObject extends App {
  // 不可变数组
  // new了一个5个元素的数组
  val a = new Array[String](5)
  println(a)
  println(a.length)
  a(1) = "hello"
  a(2) = "world"
  println(a(1))
  println(a(2))
  // 底层通过apply方法new出来了，所以不用写new
  val b = Array("hadoop", "spark", "storm")
  b(1) = "flink"
  println(b(1))
  println(b.length)
  val c = Array(1,2,3,4,5)
  println(c.sum, c.min, c.max)
  println(c.mkString(","))
  println(c.mkString("(", ",", ")"))

  // 可变数组
  val d = scala.collection.mutable.ArrayBuffer[Int]()
  println(d.length)
  println("-------------")
  d ++= Array(1,2,3,4,5)
  d += 6
  d += 7
  d.insert(0, 9,8,7)
  for(ele <- d) {
    println(ele)
  }
  d.remove(1) // 删除第二个元素
  println(d)
  d.trimEnd(2) // 从尾部删除2个
  val e = d.toArray // 把可变数组转成不可变数组
  println(e)
  for(el <- d) {
    println(el)
  }
  // 逆序输出
  for(i <- (0 until d.length).reverse) {
    println(d(i))
  }
}
