package site.it4u.c05

// 偏函数:被抱在花括号内没有match的一组case语句
object PartialFunctionApp extends App {

  // 入参和返回类型
  def sayChinese:PartialFunction[String, String] = {
    case "name1" => "名字1"
    case "name2" => "名字2"
    case _ => "无名氏"
  }

  println(sayChinese("name1"))
}
