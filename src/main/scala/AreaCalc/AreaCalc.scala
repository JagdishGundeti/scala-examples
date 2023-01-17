// Companion objects
import scala.math.pow

case class Circle(radius: Double) {
  import Circle._
  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = 3.14 * pow(radius, 2.0)
}

object AreaCalc
{
    def main(args: Array[String])
    {
		val circle1 = Circle(5.0)
		println("Area")
		println(circle1.area)

    }
}