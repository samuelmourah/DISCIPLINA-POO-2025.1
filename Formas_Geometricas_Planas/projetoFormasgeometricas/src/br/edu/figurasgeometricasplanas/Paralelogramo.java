package br.edu.figurasgeometricasplanas;

public class Paralelogramo {
	private double base;
	private double altura;
	private double area;
	
	public Paralelogramo() {
		base = 0;
		altura = 0;
		area = 0;
	}
	public void receberBase(double base) {
		this.base = base;
	}
	public void receberAltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area = (base*altura);
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostarAreaComRetorno() {
		System.out.println(" a area do paralelogramo é: "+area);
		return area;
	}
}
