package site.it4u.c05

object StringObject extends App {

  val s = "hello"
  val m = "world"
  println(s"hello:$s,$m")

  val b =
    """
      firstline
      secondline
      thirdline
    """.stripMargin
  println(b)
}
