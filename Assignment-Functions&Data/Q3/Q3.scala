object Q3{
	def main(args:Array[String])={
		val acc1=new Account("986278349V",00123,5000.00)
		val acc2=new Account("983741239V",01726,6500.00)
        println("Transfer Rs.1000 from first account to second account:")
        acc1.Transfer(acc2,1000.00)
        println("New balance of the first account: "+acc1.accBalance)
        println("New balance of the second account: "+acc2.accBalance)
	}
}


class Account(id:String,accNum:Int,balance:Double){
	var NIC:String=id
	var accountNum:Int=accNum
	var accBalance:Double=balance

	def withdraw(w:Double)={
		this.accBalance=this.accBalance-w
    }
	def deposit(d:Double)={
		this.accBalance=this.accBalance+d
	}

	def Transfer(x:Account,y:Double)={
		this.withdraw(y)
		x.deposit(y)
	}
}


