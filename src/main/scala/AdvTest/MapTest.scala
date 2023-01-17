package AdvTest
import scala.reflect.ClassTag

object MapTest
{
  val mymap : Map[Int, String] = Map(12->"Kivy", 13->"Romy",14->"Varun")
  val mymap2  = Map(12->"Kivy", 13->"Romy",14->"Varun",12->"Kivy2")

    def main(args: Array[String])
    {
      println(mymap)
      println(mymap(12))
      println(mymap(14))
      // println(mymap(5)) //java.util.NoSuchElementException:
      println(mymap2(12))
      println(mymap.keySet)
      println(mymap.keys)
      println(mymap.values)
      println(mymap.isEmpty)
      mymap.keys.foreach
      {
        key => 
          println("key : "+key)
          println("value : "+mymap(key))
      }
    }
}