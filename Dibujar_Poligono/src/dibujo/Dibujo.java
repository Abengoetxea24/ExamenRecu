package dibujo;

import java.util.ArrayList;

import base.Poligono;

public class Dibujo {
	private double anchura;
	private double altura;
	private ArrayList<Poligono> poligonos;

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public ArrayList<Poligono> getPoligonos() {
		return poligonos;
	}

	public void setPoligonos(ArrayList<Poligono> poligonos) {
		this.poligonos = poligonos;
	}

}
