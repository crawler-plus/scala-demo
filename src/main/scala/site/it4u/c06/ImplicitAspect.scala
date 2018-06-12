package site.it4u.c06

import java.io.File

// 隐式转换切面
object ImplicitAspect {
  implicit def man2Superman(man: Man): Superman = new Superman(man.name)
  implicit def file2RichFile(file:File): RichFile = new RichFile(file)
}
