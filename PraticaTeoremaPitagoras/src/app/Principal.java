package app;
public class Principal {
	public static void main(String[] args) {
		
		clases.TrianguloRectangulo triangulo1 = new clases.TrianguloRectangulo((int)(Math.random()*10+1), (int)(Math.random()*10+1));
		clases.TrianguloRectangulo triangulo2 = new clases.TrianguloRectangulo();
		
		double area1 = triangulo1.area();
		double perimetro1 = triangulo1.perimetro();
		
		double area2 = triangulo2.area();
		double perimetro2 = triangulo2.perimetro();
		
		
	}
}
