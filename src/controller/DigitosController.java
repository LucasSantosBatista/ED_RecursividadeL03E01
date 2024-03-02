package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}

	public int contaDigitos(int n) {
//		Condição de parada: número é menor que 10
		if (n < 10) {
			return 1;
		} else {
//		Chamada da função dividindo decimal + 1
			return 1 + contaDigitos(n/10);
		}
	}

}
