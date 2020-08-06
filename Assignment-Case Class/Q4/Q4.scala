
case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b

	def invert(that:Point)=Point(this.y,this.x)
	
}

object Q4{
	def main(args:Array[String])={
		val p1=Point(3,5)
		val p2=p1.invert(p1)
		
		println(p2)
	}
}

