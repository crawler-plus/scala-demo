package site.it4u.c03

object MapObject extends App {

  // 不可变map
  val a = Map("name" -> "it4u", "age" -> 20)
  println(a)
  println(a("name"), a("age"))

  // 可变的map
  val b = scala.collection.mutable.Map("name" -> "it4u", "age" -> 20)
  b("age") = 30
  println(b)

  val c = scala.collection.mutable.HashMap[String, Int]()
  println(b.getOrElse("xxx", 20)) // 如果没有这个key的值就给个默认值

  c += ("wangwu"->4, "zhaoliu"->5)
  println(c)

  // 遍历
  for((key, value) <- c) {
    println((key, value))
  }

  for(ele <- c.keySet) {
    println(c.get(ele).get)
  }

  for(value <- c.values) {
    println(value)
  }

  for((key, _) <- c) {
    println((key, c.getOrElse(key, 80)))
  }
}
