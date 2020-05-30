import scala.io.StdIn.readInt;

object primeNum{
	def gcd(x:Int,y:Int):Int={
		if(x==y)
			return x;

		if(x>y){
			return gcd(x-y,y);
		}
		else return gcd(x,y-x);
	}
	def prime(n:Int,i:Int=2):Boolean=i match{
		case x if(n==x) => true;
		case x if(gcd(n,x)>1)=>false;
		case x => prime(n,x+1);

	}
	
	def main(arg:Array[String])={
		printf("Enter the number:");
		val a=readInt;
	    println(prime(a));
	}
}