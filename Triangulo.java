import java.util.Scanner;

public class Triangulo {
	
	public static void main (String args[]) {
		double ladoTriangulo = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un lado para el triangulo: ");
		ladoTriangulo = teclado.nextDouble();
			
		System.out.println("El perimetro del triangulo es " + MetodoArea.calcularPerimetro(ladoTriangulo));
		
		
		System.out.println("El area del triangulo es " + MetodoArea.calculaArea(ladoTriangulo));
		
	}
}
