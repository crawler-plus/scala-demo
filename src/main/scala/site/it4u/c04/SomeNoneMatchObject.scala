package site.it4u.c04

object SomeNoneMatchObject extends App {

  val grades = Map("it4u"-> "A", "zhangsan"->"C")

  def getGrade(name:String): Unit = {
    val grade = grades.get(name)
    grade match {
      case Some(grade) => println(s"your grade is $grade")
      case None => println("no grade")
    }
  }

  getGrade("zhangsan")
  getGrade("lisi")

}