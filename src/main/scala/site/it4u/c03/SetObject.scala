package site.it4u.c03

object SetObject extends App {

  val set = Set(1,2,3,4,5,6,7,8,9,10)
  println(set)

  val mSet = scala.collection.mutable.Set[Int]()
  mSet += 1
  mSet += (4,5,6)
  println(mSet)
}
