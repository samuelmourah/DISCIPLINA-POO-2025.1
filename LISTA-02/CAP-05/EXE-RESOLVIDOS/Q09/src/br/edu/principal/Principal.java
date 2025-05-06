package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("digite sua primeira nota: ");
		double n1 = Scanner.nextDouble();

		System.out.print("digite sua segunda nota: ");
		double n2 = Scanner.nextDouble();
		
		double mediaAritmetica = n1 + n2/2;
		
		if (mediaAritmetica <= 3) {
		System.out.println("reprovado");
		
		}else if (mediaAritmetica > 3 && mediaAritmetica < 7) {
		System.out.println("exame");
		
		}else {
		System.out.println("aprovado");
		}
		
		
			
		
	}

}
