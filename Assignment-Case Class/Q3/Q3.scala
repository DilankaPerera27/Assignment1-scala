
case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b

	def distance(that:Point)=Point(this.x-that.x,this.y-that.y)
	
}

object Q3{
	def main(args:Array[String])={
		val p1=Point(3,5)
		val p2=Point(1,3)
		val p3=p1.distance(p2)

		println(p3)
	}
}

