object ticket{
	def main(arg: Array[String])={
	def attendees(price:Int):Int=120+((15-price)/5)*20;
		
	def rev(price:Int):Int=attendees(price)*price;
		
	def cost(price:Int):Int=500+3*attendees(price);
		
	def profit(price:Int):Int=rev(price)-cost(price);
		
	println(+profit(15),profit(10),profit(20),profit(25),profit(30),profit(35));
	println("Best ticket price=25");
	}
}