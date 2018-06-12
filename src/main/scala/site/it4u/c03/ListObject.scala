package site.it4u.c03

object ListObject extends App{

  val l = List(1,2,3,4,5)
  println(l.head)
  println(l.tail)

  val l2 = 1 :: Nil  // 把1当成head，把Nil当成tail
  println(l2)

  val l3 = 2 :: l2
  println(l3)

  val l4 = 1 :: 2 :: 3 :: Nil
  println(l4)

  println("----------")

  val l5 = scala.collection.mutable.ListBuffer[Int]()
  l5 += 2
  println(l5)
  l5 += (3,4,5)
  l5 ++= List(6,7,8,9)
  println(l5)
  l5 -= 2
  l5 -= (1,4)
  println(l5)
  l5 --= List(5,6,7,8)
  println(l5)
  val ll5 = l5.toList // 转成定长的List
  println(ll5)
  println(l5.isEmpty)
  println(l5.tail.head)

  // 递归求和
  def sum(nums:Int*):Int = {
    if(nums.length == 0) {
      0
    }else {
      nums.head + sum(nums.tail:_*)
    }
  }
  println(sum())
  println(sum(1,2,3,4))
}


