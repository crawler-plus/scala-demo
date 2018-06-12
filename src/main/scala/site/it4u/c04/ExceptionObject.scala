package site.it4u.c04

object ExceptionObject extends App {

  var i = 10 / 2
  println(i)

  try {
    var e = 10 / 0
  }catch {
    case e: ArithmeticException => println("divided by 0")
    case e: Exception => println(e.getMessage)
  }finally {
  }
}
