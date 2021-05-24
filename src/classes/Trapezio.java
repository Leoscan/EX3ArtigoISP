package classes;

import interfaces.FigurasPlanas;

public class Trapezio implements FigurasPlanas {
	private float baseMaior;
	private float baseMenor;
	private float altura;
	
	
	public Trapezio(float baseMaior, float baseMenor, float altura) {
		setBaseMaior(baseMaior);
		setBaseMenor(baseMenor);
		setAltura(altura);
	}
	public Trapezio() {
		
	}

	public float getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(float baseMaior) {
		this.baseMaior = baseMaior;
	}

	public float getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
	public String getNomeFigura() {	
		return "Trapézio";
	}

	
	public float getAreaFigura() {
		float area = baseMaior + baseMenor;
		area = area / 2;
		area = area * altura;
		return area;
	}

}
