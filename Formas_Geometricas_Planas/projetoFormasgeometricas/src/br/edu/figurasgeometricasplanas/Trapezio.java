package br.edu.figurasgeometricasplanas;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double area;
	
	public Trapezio() {
		baseMaior = 0;
		baseMenor = 0;
		altura= 0;
		area = 0;
	}
	public void receberBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public void receberBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public void receberAltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area = (baseMaior+ baseMenor)*altura/2;
	}
	public void mostrarArea() {
		System.out.println(area);
	}
	public double mostrarAreaComRetourno() {
		System.out.println("a area do trapezio é : "+area);
		return area;
	}
	
	
	
	
}
