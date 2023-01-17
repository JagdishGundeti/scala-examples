package AdvTest


object ListTest
{
    val mylist1 : List[Int] = List(1,21,334,545)

    // val mylist1 = List(1,21,334,545)
    val mylist2 = List(1,21,334,545)
    val mylist3 = List(1,5.5,4,2)
    val names = List("Sam", "Harry", "Roger", "Suggu")
    def main(args: Array[String])
    {
        f1();
        f2()
    }
        
    def f1()
    {
      println(mylist1)
      println(mylist1.head)
      println(mylist1.tail.tail)
      println("empty")
      println(mylist1.isEmpty)
      println("reverse")
      println(mylist1.reverse)
      println(mylist2)
      println("equals")
      println(mylist1.equals(mylist2))
      println(4 :: 5 :: Nil)


      println("List.fill")
      println(List.fill(3)(2))
      var lst = List.fill(6)(2)
      println(lst)
    }

    def f2()
    {
      println(mylist3.max)
      mylist3.foreach(println)
      var sum = 0.0;
      mylist1.foreach(sum +=_)
      println("sum is "+sum)

      for (name <- names)
      {
        println(name)
        // println(name(0))
      }
    }
}