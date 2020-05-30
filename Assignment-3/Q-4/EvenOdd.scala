import scala.io.StdIn.readInt;

object EvenOdd{
	def isEven(n:Int):Boolean=n match{
	case 0=>true;
	case x if(n%2==0)=>true;
	case _=> false;
	}
	def main(arg:Array[String])={
	printf("Enter the number:");
	val a=readInt;	
	println(isEven(a));
	}
}