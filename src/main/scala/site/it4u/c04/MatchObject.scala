package site.it4u.c04

import org.joda.time.DateTimeUtils.MillisProvider

import scala.util.Random

object MatchObject {

  def main(args: Array[String]): Unit = {
    val names = Array("name1", "name2", "name3")
    val name = names(Random.nextInt(names.length))
    name match {
      case "name1" => println("名字1")
      case "name2" => println("名字2")
      case _ => println("无名氏")
    }
    judgeGrade("A")
    judgeGrade("D")
    judgeGrade("zhangsan", "B")
    judgeGrade("lisi", "D")
    judgeGrade("lisi", "A")
    greeting(Array("zhangsan"))
    greeting(Array("zhangsan", "lisi"))
    greeting(Array("zhangsan", "lisi", "wangwu"))
    greeting(Array("zhaoliu"))
    greeting(List("zhangsan"))
    greeting(List("zhangsan", "lisi"))
    greeting(List("zhangsan", "lisi", "wangwu"))
    greeting(List("zhaoliu"))
    matchType("1")
    matchType(1)
    matchType(1F)
    matchType(Map("name"->"it4u"))
  }

  def judgeGrade(grade:String): Unit = {
    grade match {
      case "A" => println("excellent")
      case "B" => println("Good")
      case "C" => println("just soso")
      case _ => println("you need work harder")
    }
  }

  def judgeGrade(name:String, grade:String): Unit = {
    grade match {
      case "A" => println("excellent")
      case "B" => println("Good")
      case "C" => println("just soso")
      case _ if(name == "lisi") => println(s"${name}, you need work harder") // 双重过滤
      case _ => println("you need work harder")
    }
  }

  def greeting(array:Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("hi,zhangsan")
      case Array(x, y) => println(s"hi, $x, $y")
      case Array("zhangsan", _*)  => println("hi zhangsan and other friends")
      case _ => println("hi everyone")
    }
  }

  def greeting(list:List[String]): Unit = {
    list match {
      case "zhangsan"::Nil => println("hi zhangsan")
      case x::y::Nil => println(s"hi:$x,$y")
      case "zhangsan"::tail => println("hi zhangsan and other friends")
      case _ => println("hi everybody")
    }
  }

  def matchType(obj:Any): Unit = {
    obj match {
      case x:Int => println("int")
      case s:String => println("String")
      case m:Map[_,_] => m.foreach(println)
      case _ => println("other type")
    }
  }

}
