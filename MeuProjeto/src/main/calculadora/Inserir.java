package main.calculadora;

import javax.swing.JOptionPane;

public class Inserir {
	static String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro numero:");
	static String segundoNumero = JOptionPane.showInputDialog("Digite o segundo numero:");

	public static int numero1 = Integer.parseInt(primeiroNumero);
	public static int numero2 = Integer.parseInt(segundoNumero);

	/**
	 * @return the primeiroNumero
	 */
	public String getPrimeiroNumero() {
		return primeiroNumero;
	}

	/**
	 * @param primeiroNumero the primeiroNumero to set
	 */
	public void setPrimeiroNumero(String primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	/**
	 * @return the segundoNumero
	 */
	public String getSegundoNumero() {
		return segundoNumero;
	}

	/**
	 * @param segundoNumero the segundoNumero to set
	 */
	public void setSegundoNumero(String segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	/**
	 * @return the numero1
	 */
	public int getNumero1() {
		return numero1;
	}

	/**
	 * @param numero1 the numero1 to set
	 */
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	/**
	 * @return the numero2
	 */
	public int getNumero2() {
		return numero2;
	}

	/**
	 * @param numero2 the numero2 to set
	 */
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

}
