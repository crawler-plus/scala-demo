package site.it4u.c03

object OptionObject extends App {
  val m = Map(1 -> 2)
  println(m(1))
  println(m.get(1).get)
  println(m.getOrElse(2, "None"))
}
