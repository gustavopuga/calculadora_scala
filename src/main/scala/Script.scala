object Script extends App{
    
	val x = args(0).toInt
	val operation = args(1)
	val y = args(2).toInt
	
	val c = new Calculadora

	operation match {
		case "+" => println(c.+(x, y))
		case "-" => println(c.-(x, y))
		case "*" => println(c.*(x, y))
		case "/" => println(c./(x, y))
		case "%" => println(c.%(x, y))
		case _ => println("OPERAÇÃO DESCONHECIDA")	
		
	}
}
