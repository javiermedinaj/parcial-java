package parcial;

public class Articulo {
	private String codigo;
	private int cantidad;
	private double precioUnidad;

	public Articulo(String codigo, int cantidad, double precioUnidad) {
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precioUnidad = precioUnidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void vendeArticulo(int num) {
		if (num <= cantidad) {
			cantidad -= num;
		}
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Cantidad: " + cantidad + ", Precio Unidad: " + precioUnidad;
	}
}