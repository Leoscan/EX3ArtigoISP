package classes;

import interfaces.FigurasPlanas;

public class Quadrado implements FigurasPlanas {
	private float lado;

	public Quadrado(float lado) {
		setLado(lado);
	}
	public Quadrado(){
		
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public String getNomeFigura() {
		return "Quadrado";
	}

	public float getAreaFigura() {
		float area = 0;
        area = lado * lado;
		return area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome da Figura: ");
		builder.append(getNomeFigura());
		builder.append("\nÁrea da Figura:");
		builder.append(getAreaFigura());
		return builder.toString();
	}

}
