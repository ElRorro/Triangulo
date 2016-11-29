//Cacular altura ????

public class MetodoArea{
	
	public static double calculaArea (double area, double baseTriangulo, double ladoTriangulo, double altura){
	 baseTriangulo = ladoTriangulo/2;
	 area = (baseTriangulo * calcularAltura(altura, ladoTriangulo, baseTriangulo))/2;
	 
	 return area;
	 
	}
	
    //La fórmula es a = (b * h) / 2
    //base = lado / 2
    
}
