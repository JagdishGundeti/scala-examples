package AdvTest


object SetTest
{
    val myset1 : Set[Int] = Set(1, 21, 334, 545)
    // val myset1 = Set(1,21,334,545)
    val myset2 = Set(1,21,334,545)
    val myset3 = Set(1,5.5,4,2)
    val myset4 = Set(1,5,21,2)
    val names = Set("Sam", "Harry", "Roger", "Suggu")
    def main(args: Array[String])
    {
        // f1();
        // f2();
        fnew()
    }
    def fnew()
    {
      println("fnew fun")
      println(myset1+10) //add element random place
      println(myset1(21)) //found element
      println(myset1(32)) //not found element
      println(names("Harry")) //found element
      println(names("Harry1")) //not found element
      println(myset1.head)
      println(myset1.tail)
      println(myset1.isEmpty)
      println(myset1 ++ myset4)
      println(myset1.++(myset4))
      println(myset1.&(myset4))
      println(myset1.intersect(myset4))
      println(myset1 & myset4)
      myset1.foreach(println)
      for (itr<-myset1)
      {
        println(itr)
      }
    }
    def f1()
    {
      println(myset1)
      println(myset1.head)
      println(myset1.tail.tail)
      println("empty")
      println(myset1.isEmpty)
      println("reverse")
      println(myset2)
      println("equals")
      println(myset1.equals(myset2))
      println(4 :: 5 :: Nil)


      println("Set.fill")
      println(Set.fill(3)(2))
      var lst = Set.fill(6)(2)
      println(lst)
    }


    def f2()
    {
      println("f2 fun")
      println(myset3.max)
      myset3.foreach(println)
      var sum = 0.0;
      myset1.foreach(sum +=_)
      println("sum is "+sum)

      for (name <- names)
      {
        println(name)
        // println(name(0))
      }
    }
}