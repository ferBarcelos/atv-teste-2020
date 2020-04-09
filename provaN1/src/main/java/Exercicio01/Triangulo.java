package Exercicio01;

import Exercicio01.interfaces.Triangol;

public class Triangulo implements Triangol {
	
	private int v1;
	private int v2;
	private int v3;


	public Triangulo(int v1, int v2, int v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
		
	public boolean isTriangulo() {
		if ((v1 < v2 + v3) && (v2 < v1 + v3) && (v3 < v1 + v2)){
			return true;
		}
		return false;
	}

	public boolean isTrianguloEscaleno() {
		if((v1!= v2 && v1!= v3 && v2!=v3) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloEquilatero() {
		if((v1 == v2 && v1 == v3) && this.isTriangulo()) {
			return true;
		}
		return false;
	}

	public boolean isTrianguloIsoceles() {
		if(((v1 == v2) || (v1 == v3)) && this.isTriangulo()) 
		return true;

		return false;
	}

}
