package view;
import javax.swing.JOptionPane;
import controller.DigitosController;

public class Main {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				
		DigitosController dCont = new DigitosController();
		int resultado = dCont.contaDigitos(n);
		System.out.println("Número: " + n  + " | Quantidade de digitos: " + resultado);
	}

}
