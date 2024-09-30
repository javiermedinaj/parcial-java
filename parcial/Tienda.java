package parcial;

import java.util.ArrayList;

public class Tienda {
	private final String nombre;
	private final ArrayList<Articulo> lista;

	public Tienda(String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<>();
	}

	public void agregarALaLista(Articulo a) {
		if (buscaArticulo(a.getCodigo()) == null) {
			lista.add(a);
		}
	}

	public Articulo buscaArticulo(String codigo) {
		for (Articulo articulo : lista) {
			if (articulo.getCodigo().equals(codigo)) {
				return articulo;
			}
		}
		return null;
	}

	public double vende(String codigo, int num) {
		Articulo articulo = buscaArticulo(codigo);
		if (articulo != null) {
			articulo.vendeArticulo(num);
			return articulo.getPrecioUnidad() * num;
		}
		return 0;
	}

	public void escribePedido(int min) {
		System.out.println("Tienda: " + nombre);
		for (Articulo articulo : lista) {
			if (articulo.getCantidad() < min) {
				System.out.println(articulo);
			}
		}
	}
}