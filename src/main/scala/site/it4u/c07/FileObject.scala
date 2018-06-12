package site.it4u.c07

import scala.io.Source

object FileObject extends App {

  val file = Source.fromFile("hello.txt")(scala.io.Codec.UTF8)

  def readLine(): Unit = {
    for(line <- file.getLines()) {
      println(line)
    }
  }

  readLine()

  def readChar(): Unit = {
    for(ele <- file) {
      println(ele)
    }
  }

  readChar()

  def readNet(): Unit = {
    val baiduStr = Source.fromURL("http://www.baidu.com").mkString
    println(baiduStr)
  }

  readNet()


}
