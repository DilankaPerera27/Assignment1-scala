import scala.io.StdIn.readInt;

object caesar_cipher extends App{
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	val shift = (scala.io.StdIn.readLine("Shift by:").toInt+alphabet.size)%alphabet.size;
	val text = scala.io.StdIn.readLine("Message: ");
	val OutputText = text.map( (c:Char)=> {
		val a= alphabet.indexOf(c.toUpper);
		if(a== -1){
			c;
		}
		else{
			alphabet((a+shift)%alphabet.size);
		}
	});
	println(OutputText)
}