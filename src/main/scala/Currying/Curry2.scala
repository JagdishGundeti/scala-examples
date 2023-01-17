// Scala program add two numbers
// using Currying function

object Curry2
{
	// transforming the function that
	// takes two(multiple) arguments into
	// a function that takes one(single) argument.
	def add2(a: Int) = (b: Int) => a + b;
    def add2new(a: Int) (b: Int) = a + b;//operator = is not exist and => is modified to =

	// Main method
	def main(args: Array[String])
	{
		// println(add2(20, 19)); //found 2 expected 1
		println(add2(20)(19));
		println(add2new(20)(19));
		//New way
        // Partially Applied function.
        val sum = add2(29);
        println(sum(5));
        val sumNew=add2new(29)_;
        println(sum(5));
	}
}
