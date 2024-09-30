package recuperatorio2;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private List<Articulo> listaArticulos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.listaArticulos = new ArrayList<>();
    }

    public void agregarALaLista(Articulo a) {
        listaArticulos.add(a);
    }

    public Articulo buscaArticulo(String codigo) {
        for (Articulo a : listaArticulos) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null;
    }

    public double vende(String codigo, int num) {
        Articulo articulo = buscaArticulo(codigo);
        if (articulo != null) {
            int cantidadInicial = articulo.getCantidad();
            articulo.vendeArticulo(num);
            int cantidadVendida = cantidadInicial - articulo.getCantidad();
            return cantidadVendida * articulo.getPrecioUnidad();
        }
        return 0;
    }

    public void escribePedido(int min) {
        System.out.println("Tienda: " + nombre);
        for (Articulo a : listaArticulos) {
            if (a.getCantidad() < min) {
                System.out.println("Código: " + a.getCodigo() + ", Cantidad: " + a.getCantidad() + ", Precio Unidad: " + a.getPrecioUnidad());
            }
        }
    }
}