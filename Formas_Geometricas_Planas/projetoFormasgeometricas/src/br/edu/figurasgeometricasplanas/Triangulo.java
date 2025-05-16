package br.edu.figurasgeometricasplanas;

public class Triangulo {
 private double base;
 private double altura;
 private double area;

	public Triangulo(){
	base = 0;
	altura = 0;
	area =0;
}
	public void receberAltura(double altura) {
		this.altura =  altura;
	}
	public void receberBase(double base) {
		this.base = base;
	}
	
	public void calcArea() {
		area = (base*altura)/2;
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostarAreaComRetorno() {
		System.out.println("a area do triangulo é: "+area);
		return area;
	}
}
