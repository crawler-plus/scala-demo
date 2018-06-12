package site.it4u.c03

object TupleObject extends App {

  val a = (1,2,3,4,5)
  println(a)
  println(a._1) //  取值
  println(a._2)
  // 遍历
  for(i <- 0 until a.productArity) {
    println(a.productElement(i))
  }
  val hostPort = ("localhost", 8888)
  println(hostPort._1, hostPort._2)
}
