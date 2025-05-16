package br.edu.figurasgeometricasplanas;

public class Pentagono {

	private double perimetro;
	private double apotema;
	private double area;
		
	public Pentagono() {
		perimetro = 0;
		apotema= 0;
		area = 0;
	}
	public void receberPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public void receberApotema(double apotema) {
		this.apotema = apotema;
	}
	public void calcArea() {
		area = (perimetro*apotema)/2;
	}
	public void mostrarArea() {
		System.out.println();
	}
	public double mostrarAreaComRetorno() {
		System.out.println("a area do pentagono é: "+area);
		return area;
	}
	
}
