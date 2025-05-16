package br.edu.figurasgeometricasplanas;

public class Quadrado {
	private double lado;
	private double area;
	
	public Quadrado() {
		lado= 0;
		area = 0;	
	}
	public void receberLado(double lado) {
		this.lado =lado;
	}
	public void calcArea() {
		area = (lado*lado);
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostrarAreaComRetorno() {
		System.out.println("a area do quadrado é: " + area);
		return area;
	}
}
