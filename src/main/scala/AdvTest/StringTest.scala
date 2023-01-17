
object StringTest
{
    val str1 : String = "Hello World";
    val str2 : String = "Max";
    def main(args: Array[String])
    {
      println(str1.length())
      println(str1.concat(str2))
      println(str1.concat(" ").concat(str2))
      println("+ method")
      println(str1 + str2)

      val vpf = printf("%d--%f--%s",21, 213.0f, "hello")
      println(vpf)
      println("%d--%f--%s".format(21, 213.0f, "hello"))
      println(4 :: 5 :: Nil)

    }
}