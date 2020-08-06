
case class Point(a:Int,b:Int){
	def x:Int=a
	def y:Int=b

	def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
	
}

object Q2{
	def main(args:Array[String])={
		val p1=Point(3,5)
		val p2=p1.move(1,3)

		println(p2)
	}
}

