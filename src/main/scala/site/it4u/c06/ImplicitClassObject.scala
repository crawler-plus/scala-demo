package site.it4u.c06

object ImplicitClassObject extends App {

  // int方法都有add方法了
  implicit class Calculator(x:Int) {
    def add(a:Int) = a + x
  }
  println(1.add(3))
}


