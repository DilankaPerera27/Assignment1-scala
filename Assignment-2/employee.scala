object employee{
	def main(arg: Array[String])={
	var nPayment=150;
	var otPayment=75;
	var nHours=40;
	var otHours=20;
	var tax=0.1;
	

	var payment=nPayment*nHours+otPayment*otHours;
	var Tax=payment*tax;
	var salary=payment-Tax;

	println("Salary="+salary);
	}
}