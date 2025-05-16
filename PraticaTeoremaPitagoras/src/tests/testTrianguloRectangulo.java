package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	static TrianguloRectangulo triangulo1;
	static TrianguloRectangulo triangulo2;
	static TrianguloRectangulo error;
	
	@BeforeAll
	static void setup() {
		triangulo1 = new TrianguloRectangulo() {};
		triangulo2 = new TrianguloRectangulo(3, 5) {};
		error = new TrianguloRectangulo(-1, 2) {};
	}
	
	@Test
	void testArea1() {
		//TrianguloRectangulo triangulo1 = new TrianguloRectangulo();
		double primero = 0.5;
		double segundo = triangulo1.area();
		assertEquals(primero, segundo);
	}

	@Test
	void testArea2() {
		//TrianguloRectangulo triangulo2 = new TrianguloRectangulo(3, 5);
		double primero = 7.5;
		double segundo = triangulo2.area();
		assertEquals(primero, segundo);
	}
	
	@Test
	void testPerimetro1() {
		//TrianguloRectangulo triangulo1 = new TrianguloRectangulo();
		double primero = 1.41421356237;
		double segundo = triangulo1.perimetro();
		assertEquals(primero, segundo);
	}

	@Test
	void testPerimetro2() {
		//TrianguloRectangulo triangulo2 = new TrianguloRectangulo(3, 5);
		double primero = 5.83095189485;
		double segundo = triangulo2.perimetro();
		assertEquals(primero, segundo);
	}
	
	@Test
	void testAreaNegativa() {
		//TrianguloRectangulo error = new TrianguloRectangulo(-1, 2);
		assertThrows(IllegalArgumentException.class,() -> {error.area();});
	}
	
	@Test
	void testHipotenusaNegativa() {
		//TrianguloRectangulo error = new TrianguloRectangulo(-1, 2);
		assertThrows(IllegalArgumentException.class,() -> {error.hipotenusa();});
	}
	
	@Test
	void testPerimetroNegativo() {
		//TrianguloRectangulo error = new TrianguloRectangulo(-1, 2);
		assertThrows(IllegalArgumentException.class,() -> {error.perimetro();});
	}
	
}
