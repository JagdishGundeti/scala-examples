// Scala program add two numbers
// using currying Function
object Curry1
{
	// Define currying function
	def add(x: Int, y: Int) = x + y;

	def main(args: Array[String])
	{
		println(add(20, 19));
	}
}
