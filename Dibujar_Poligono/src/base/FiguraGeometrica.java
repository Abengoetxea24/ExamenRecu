package base;

public class FiguraGeometrica {
	private String nombre;
	private double area;
	private double perimetro;

	public FiguraGeometrica(String nombreAsignado) {
		this.nombre = nombreAsignado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

}
