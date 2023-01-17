package AdvTest
import scala.reflect.ClassTag

object TypeTest
{
    val x = 5
    def f[T](v: T) = v
    def f2[T](v: T) = v match {
      case _: Int    => "Int"
      case _: String => "String"
      case _         => "Unknown"
    }

    val xany: Any = 5
    val yint = 5
    val names = Set("Sam", "Harry", "Roger", "Suggu")
    val mylist2 = List(1,21,334,545)

    def f3[T](v: T)(implicit ev: ClassTag[T]) = ev.toString

    def main(args: Array[String])
    {
          println(f(x)) // T is Int, the type of x
          f(x)
          println(f2(x))
          println(f3(xany))
          println(f3(yint))
          println(f3(names))
          println(f3(mylist2))
          
    }
}