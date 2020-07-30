object Q4{
	def main(args:Array[String])={
		val Bank:List[Account]=List(
        new Account("0001",1111,37640.00),
        new Account("0002",1112,350.00),
        new Account("0003",1113,-2500.00),
        new Account("0004",1114,4500.00),
        new Account("0005",1115,-350.00),
        new Account("0006",1116,56500.00),
        new Account("0007",1117,-550.00),
        new Account("0008",1118,95000.00)
		)
	
	    println("4.1: Accounts with negative balances: "+Bank(0).overdraft(Bank))
	    val n=Bank(0).sumOfBalance(Bank)
	    println("4.2: Sum of all account balances: "+n.accBalance)
	    println("4.3: The final balance of all accounts after applying the interest: "+Bank(0).Interest(Bank))

    }
}

class Account(id:String,num:Int,balance:Double){
	val NIC:String=id
	var accNum:Int=num
	var accBalance:Double=balance
	val overdraft=(a:List[Account])=>a.filter(n=>n.accBalance<0)
	val sumOfBalance=(a:List[Account])=>a.reduce((x,y)=>(new Account("all",0,x.accBalance+y.accBalance)))
	val Interest=(a:List[Account])=>a.map(x=>{if(x.accBalance<0) (new Account(x.NIC,x.accNum,x.accBalance*1.05)) else(new Account(x.NIC,x.accNum,accBalance*1.1))})

	override def toString="["+NIC+":"+accNum+":"+accBalance+"]"	
}