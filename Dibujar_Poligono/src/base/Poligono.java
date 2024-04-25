package base;

import dibujo.Dibujo;
/**
 * Esta clase extiende de FiguraGeometrica e implementa la figura de un polígono.
 * @author Asier Iza
 *
 */
public class Poligono extends FiguraGeometrica {

	// Número de lados del polígono:
	private int lados;
	// Longitud de cada lado:
	private double longitudLado;
	//A qué dibujo pertenece (opcional):
	private Dibujo dibujo;
	
	

	public Poligono(String nombreAsignado) {
		super(nombreAsignado);
	}
/*
	public double calcularArea() {
		double area = 0.0;
		if (lados > 2 && longitudLado > 0) {
			double a = longitudLado / (2.0 * Math.tan(Math.PI / lados));
			area = calcularPerimetro() * a / 2.0;
		}
		setArea(area);
		return area;
	}
*/
	/**
	 * Este método devuelve el perímetro de un polígono a partir de su número de lados y longitud.
	 * 
	 * @author Asier Iza
	 * @version 1.0
	 * @return Devuelve el perímetro como double
	 */
	public double calcularPerimetro() {
		double perimetro = 0.0;
		if (lados > 0) {
			int cuentaLados = lados;
			while(cuentaLados > 0) {
				perimetro += longitudLado;
				cuentaLados--;
			}			
		}
		setPerimetro(perimetro);
		return perimetro;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}
	

}
