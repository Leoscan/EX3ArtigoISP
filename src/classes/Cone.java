package classes;

import interfaces.FigurasEspaciais;

public class Cone implements FigurasEspaciais {
	private float aBase;
	private float altura;
	
	public Cone(float aBase, float altura) {
		setaBase(aBase);
		setAltura(altura);
	}
	public Cone() {
		
	}

	public float getaBase() {
		return aBase;
	}

	public void setaBase(float aBase) {
		this.aBase = aBase;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String getNomeFigura() {
		return "Cone";
	}

	@Override
	public float getVolumeFigura() {
		float volume = aBase * altura;
		return volume;
	}
	
}
