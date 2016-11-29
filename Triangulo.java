import java.util.Scanner;

public class Triangulo {
	
	public static double calcularPerimetro (double ladoTriangulo){
		return 3*ladoTriangulo;
	}
	
	public static double calcularAltura(double altura, double ladoTriangulo, double baseTriangulo){
		baseTriangulo = ladoTriangulo/2;
		altura = Math.sqrt(baseTriangulo*baseTriangulo + ladoTriangulo*ladoTriangulo);
		
		return altura;
	}
	
	public static void main (String args[]) {
		double perimetro;
		double ladoTriangulo;
		double altura = 0;
		double baseTriangulo = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un lado para el triangulo: ");
		ladoTriangulo = teclado.nextDouble();
		
		System.out.println("El perimetro del triangulo es " + calcularPerimetro(ladoTriangulo));
		calcularAltura(altura, ladoTriangulo, baseTriangulo);
		
	}
}
