package recuperatorio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda("Mi Tienda");

        while (true) {
            System.out.println("1. Insertar un artículo nuevo");
            System.out.println("2. Mostrar los datos de un artículo");
            System.out.println("3. Vender unidades de un artículo");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del artículo: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio por unidad: ");
                    double precioUnidad = scanner.nextDouble();
                    Articulo articulo = new Articulo(codigo, cantidad, precioUnidad);
                    tienda.agregarALaLista(articulo);
                    break;
                case 2:
                    System.out.print("Ingrese el código del artículo: ");
                    codigo = scanner.nextLine();
                    Articulo articuloBuscado = tienda.buscaArticulo(codigo);
                    if (articuloBuscado != null) {
                        System.out.println("Código: " + articuloBuscado.getCodigo() + ", Cantidad: " + articuloBuscado.getCantidad() + ", Precio Unidad: " + articuloBuscado.getPrecioUnidad());
                    } else {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del artículo: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVender = scanner.nextInt();
                    double totalVendido = tienda.vende(codigo, cantidadVender);
                    if (totalVendido > 0) {
                        System.out.println("Total vendido: " + totalVendido);
                        Articulo articuloVendido = tienda.buscaArticulo(codigo);
                        System.out.println("Código: " + articuloVendido.getCodigo() + ", Cantidad: " + articuloVendido.getCantidad() + ", Precio Unidad: " + articuloVendido.getPrecioUnidad());
                    } else {
                        System.out.println("Artículo no encontrado o cantidad insuficiente.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
