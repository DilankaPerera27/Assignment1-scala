object cost{
	def main(arg: Array[String])={
	var price=24.95;
	var dis=0.4;
	var sCost1=3;
	var sCost2=0.75;

	println("cost="+((((price-(price*dis))+sCost1)*50)+(((price-(price*dis))+sCost2)*10)));

	}
}