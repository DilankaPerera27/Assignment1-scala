import scala.io.StdIn.readInt;

object fib{
	def fibonacci(n:Int):Int= n match{
		case 0 => 0;
		case x if x==1 => 1;
		case _ => fibonacci(n-1)+fibonacci(n-2);	
	}
	def fibSq(n:Int):Unit={
		if(n>0) fibSq(n-1);
		println(fibonacci(n));
	}
	def main(arg:Array[String])={
		printf("Enter the number:");
		val a=readInt();
		fibSq(a);
	}
}