import org.specs2.mutable.Specification
import org.specs2.specification.Scope;

class CalculadoraSpec extends Specification {

	"fazer calculos com a calculadora" >> {

		"soma de numeros" >> new CalculadoraEscopo {
			calculadora.+(1, 2) must beEqualTo(3)
		}

		"subtracao de numeros" >> new CalculadoraEscopo {
			calculadora.-(3, 4) must beEqualTo(-1)
		}

		"multiplicacao de numeros" >> new CalculadoraEscopo {
			calculadora.*(2, 3) must beEqualTo(6)
		}

		"divisao de numeros" >> new CalculadoraEscopo {
			calculadora./(6, 2) must beEqualTo(3)
		}

		"modulo de numeros" >> new CalculadoraEscopo {
			calculadora.%(2, 1) must beEqualTo(0)
		}

		"porcentagem de numeros" >> new CalculadoraEscopo {
			calculadora.perc(200, 10) must beEqualTo(20)
		}

	}
	
	trait CalculadoraEscopo extends Scope {
		val calculadora = new Calculadora
	}

}
