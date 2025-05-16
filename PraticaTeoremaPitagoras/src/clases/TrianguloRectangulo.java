	package clases;
	/**
	* Clase que realiza calculos sobre un trinagulo rectangulo
	*
	* @author Lucia Gallar Lorenzo
	*/
	public class TrianguloRectangulo {
		
		private int a, b;
		private double c;
		
		/**
		 * Constructor por defecto que crea un triangulo rectangulo donde a = 1, b = 2
		 */
		public TrianguloRectangulo() {
			this.a = 1;
			this.b = 1;
		}
		
		/**
		 * Constructor que crea un triangulo rectangulo con los parametros introducidos
		 *
		 * @param cateto1
		 * @param cateto2
		 */
		public TrianguloRectangulo(int cateto1, int cateto2) {
			if (cateto1 <= 0 || cateto2 <= 0) throw new IllegalArgumentException();
			else {
				this.a = cateto1;
				this.b = cateto2;
			}
		}
		
		/**
		 * Calcula el area del rectangulo
		 *
		 * @return		area en double
		 */
		public double area() {
			double area = (double)(Math.round((this.a*this.b)/2)*100.0)/100.0;
			return area;
		}
		
		/**
		 * Calcula la hipotenusa del triangulo rectangulo
		 *
		 * @return		hipotenusa en double
		 */
		public double hipotenusa() {
			c = (double)(Math.round(Math.sqrt((a*a)+(b*b)))*100.0)/100.0;
			return c;
		}
		
		/**
		 * Calcula el perimetro de el triangulo rectangulo
		 *
		 * @return		perimetro en double
		 */
		public double perimetro() {
			double perimetro = (double)(Math.round(this.a*this.b*this.hipotenusa())*100.0)/100.0;
			return perimetro;
		}
		
		public int getA() {
			return this.a;
		}
		
		public int getB() {
			return this.b;
		}
		
		public double getC() {
			return this.c;
		}
		
		public void setA(int nuevo) {
			this.a = nuevo;
		}
		
		public void setB(int nuevo) {
			this.b = nuevo;
		}
		
		public void setC(double nuevo) {
			this.c = nuevo;
		}
		
		public String toString() {
			return "a = "+this.a+"\nb = "+this.b+"\nc = "+this.hipotenusa();
		}
}


