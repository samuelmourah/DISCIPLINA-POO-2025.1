package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	public Circulo() {
		raio = 0;
		area = 0;
	}
	public void receberRaio(double raio) {
		this.raio = raio;
	}
	public void calcArea() {
		area = (Math.PI*raio*raio);
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostrarAreaComRetorn() {
		System.out.println("a area do triangulo é: "+area);
		return area;
	}
}
