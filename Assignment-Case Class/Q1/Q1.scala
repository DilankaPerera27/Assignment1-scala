
case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b

	def +(that:Point)=Point(this.x+that.x,this.y+that.y)
	
}

object Q1{
	def main(args:Array[String])={
		val p1=Point(3,5)
		val p2=Point(1,2)

		println(p1+p2)
	}
}

