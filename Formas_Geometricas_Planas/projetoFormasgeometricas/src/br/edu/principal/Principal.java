package br.edu.principal;
import br.edu.figurasgeometricasplanas.*;
public class Principal {

	public static void main(String[] args) {
		
		Quadrado fg1 = new Quadrado();
		fg1.receberLado(10);
		fg1.calcArea();
		fg1.mostrarArea();
		double receberAreaqua= fg1.mostrarAreaComRetorno();
	
		Triangulo fg2 = new Triangulo() ;
		fg2.receberBase(10);
		fg2.receberAltura(2);
		fg2.calcArea();
		fg2.mostrarArea();
		double recebeAreatri = fg2.mostarAreaComRetorno();
		
		Retangulo fg3 = new Retangulo();
		fg3.receberBase(2.5);
		fg3.receberAltura(2);
		fg3.calcArea();
		fg3.mostrarArea();
		double ReceberArearet =fg3.mostarAreaComRetorno();
		
		Circulo fg4 = new Circulo();
		fg4.receberRaio(5.5);
		fg4.calcArea();
		fg4.mostrarArea();
		double recebeAreacirc = fg4.mostrarAreaComRetorn();	
		
		Losango fg5 = new Losango();
		fg5.receberDiagMaior(5);
		fg5.receberDiagMenor(10);
		fg5.calcArea();
		fg5.mostrarArea();
		double receberArealos = fg5.mostrarAreaComRetotno();
		
		Trapezio fg6 = new Trapezio();
		fg6.receberBaseMaior(1);
		fg6.receberBaseMenor(10);
		fg6.receberAltura(2);
		fg6.calcArea();
		fg6.mostrarArea();
		double receberAreatra =fg6.mostrarAreaComRetourno();
		
		Paralelogramo fg7 = new Paralelogramo();
		fg7.receberBase(10);
		fg7.receberAltura(5.5);
		fg7.calcArea();
		fg7.mostrarArea();
		double receberAreapar = fg7.mostarAreaComRetorno();
		
		Hexagono fg8 = new Hexagono();
		fg8.receberLado(10);
		fg8.calcArea();
		fg8.mostrarArea();
		double receberArea = fg8.mostarAreaComRetorno();
		
		Pentagono fg9 = new Pentagono();
		fg9.receberPerimetro(1.5);
		fg9.receberApotema(2);
		fg9.calcArea();
		fg9.mostrarArea();
		double receberAreaPen = fg9.mostrarAreaComRetorno();
		
		 
	}
}
