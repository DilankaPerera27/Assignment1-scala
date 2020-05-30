import scala.io.StdIn.readInt;

object addEven{
	
var sum:Int=0;
	def sum(n:Int):Unit={
		sum=sum+n;
		if(n==0){
	    println("sum="+sum);
	    }
		else sum(n-2);
	
	}

	def main(arg:Array[String])={
	printf("Enter the number:");
	val i:Int=readInt;
	if(i%2==0){
		sum(i-2);
	}	
	else sum(i-1);
	
	}
}