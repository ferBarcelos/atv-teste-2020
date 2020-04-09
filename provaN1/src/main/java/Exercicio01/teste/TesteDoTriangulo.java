package Exercicio01.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Exercicio01.Triangulo;

public class TesteDoTriangulo {

	private Triangulo triangulou;

	@Before
	public void setUp() throws Exception {
		triangulou = new Triangulo(1,1,1);
	}
	
		
	@Test
	public void testeTriangulo() {
		assertFalse(new Triangulo(0,0,0).isTriangulo());
		assertTrue(new Triangulo(12,9,6).isTriangulo());
	}
	
	@Test
	public void testeTrianguloEquilatero() {
		assertTrue(new Triangulo(2,2,2).isTrianguloEquilatero());
		assertFalse(new Triangulo(1,3,1).isTrianguloEquilatero());
	}
	
	@Test
	public void testeTrianguloEscaleno() {
		assertFalse(new Triangulo(2,2,2).isTrianguloEscaleno());
		assertTrue(new Triangulo(12,9,6).isTrianguloEscaleno());
	}
	
	@Test
	public void testeTrianguloIsoceles() {
		assertTrue(new Triangulo(10,10,12).isTrianguloIsoceles());
		assertFalse(new Triangulo(10,10,-4).isTrianguloIsoceles());
		assertFalse(new Triangulo(10,10,0).isTrianguloIsoceles());
	}
}
