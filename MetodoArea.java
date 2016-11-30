public class MetodoArea{
	
	public static double calcularPerimetro (double ladoTriangulo){
		return 3*ladoTriangulo;
	}
	
	public static double calculaArea (double ladoTriangulo){
	 double altura = Math.sqrt(Math.pow(ladoTriangulo, 2) - Math.pow(ladoTriangulo/2, 2) );
	 double area = (ladoTriangulo * altura)/2;
	 
	 return area;
	}
	
    //La fórmula es a = (b * h) / 2
    //base = lado / 2
    
}
