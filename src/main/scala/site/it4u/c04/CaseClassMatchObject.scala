package site.it4u.c04

object CaseClassMatchObject extends App {

  def caseClassMatch(person:Person): Unit = {
    person match {
      case CTO(name,floor) => println(s"cto name is $name,floor is $floor")
      case Employee(name,floor) => println(s"Employee name is $name,floor is $floor")
      case _ => println("other")
    }
  }

  caseClassMatch(CTO("IT4U", "22"))
  caseClassMatch(Employee("IT4U", "26"))
  caseClassMatch(Other("IT4U"))
}

class Person
case class CTO(name:String, floor:String) extends Person
case class Employee(name:String, floor:String) extends Person
case class Other(name:String) extends Person
