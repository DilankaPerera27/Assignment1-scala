import math.abs

class Rational(n:Int,d:Int){
	def gcd(a:Int,b:Int):Int={
		if(b==0){
			a
		}
		else{
			gcd(b,a%b)
		}
	}

	def numer=n/gcd(Math.abs(n),d)
	def denom=d/gcd(Math.abs(n),d)

	
    
    //def add(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)
    def neg=new Rational(-this.numer,this.denom)
    def -(r:Rational)=new Rational(this.numer*r.denom-r.numer*this.denom,this.denom*r.denom)
	override def toString= s"$numer/$denom"
}


object Q2{
	def main(args: Array[String])={
        val x=new Rational(3,4)
        val y=new Rational(5,8)
        val z=new Rational(2,7)
	    println(x.-(y).-(z))
    }
}