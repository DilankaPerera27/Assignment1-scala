class Rational(n:Int,d:Int){
	def numer=n
	def denom=d

    def neg=new Rational(-this.numer,this.denom)
	override def toString= s"$numer/$denom"
}


object Q1{
	def main(args: Array[String])={
        println("Enter the numerator of the rational number:")
        var a=scala.io.StdIn.readInt()
        println("Enter the denominator of the rational number:")
        var b=scala.io.StdIn.readInt()
	    val r1=new Rational(a,b);
	
	    println(r1.neg)
    }
}