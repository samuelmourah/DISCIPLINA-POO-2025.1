package br.edu.figurasgeometricasplanas;

public class Losango {
 private double diagMaior;
 private double diagMenor;
 private double area;
 
 public Losango() {
	 diagMaior = 0;
	 diagMenor = 0;
	 area = 0;
 }
 public void receberDiagMaior(double diagMaior) {
	 this.diagMaior = diagMaior;
 }
 public void receberDiagMenor(double diagMenor) {
	 this.diagMenor = diagMenor;
 }
 public void calcArea() {
	 area = (diagMaior*diagMenor)/2;
 }
 public void mostrarArea() {
	 System.out.println();
 }
 public double mostrarAreaComRetotno() {
	 System.out.println(" a area do losango é: "+area);
	 return area;
 }
 
 
}
