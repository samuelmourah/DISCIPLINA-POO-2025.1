package br.edu.figurasgeometricasplanas;

public class Hexagono {
	private double lado;
	private double area;
	
	public Hexagono() {
		lado = 0;
		area = 0;
	}
	public void receberLado(double lado) {
		this.lado = lado;
	}
	public void calcArea() {
		area =(3* Math.sqrt(3) /2);
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostarAreaComRetorno() {
		System.out.println(" a area do hexagono é: "+area);
		return area;
	}
}
