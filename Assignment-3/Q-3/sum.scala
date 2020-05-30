import scala.io.StdIn.readInt;

object sum{
	def sum(n:Int):Int={
	if(n==1) 1;
	else n+sum(n-1);
	}
	def main(arg:Array[String])={
		printf("Enter the number:");
		val a=readInt;
	println(sum(a));
	}
}