
package parcial2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda("Mi Tienda");

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Insertar un artículo nuevo");
            System.out.println("2. Mostrar los datos de un artículo dado un código determinado");
            System.out.println("3. Vender un cierto número de unidades de un artículo");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del artículo: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del artículo: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio por unidad del artículo: ");
                    double precioUnidad = scanner.nextDouble();
                    tienda.agregarALaLista(new Articulo(codigo, cantidad, precioUnidad));
                    break;
                case 2:
                    System.out.print("Ingrese el código del artículo: ");
                    codigo = scanner.nextLine();
                    Articulo articulo = tienda.buscaArticulo(codigo);
                    if (articulo != null) {
                        System.out.println(articulo);
                    } else {
                        System.out.println("El artículo no está en la lista.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del artículo: ");
                    codigo = scanner.nextLine();
                    System.out.print("Ingrese el número de unidades a vender: ");
                    int num = scanner.nextInt();
                    double totalVendido = tienda.vende(codigo, num);
                    if (totalVendido > 0) {
                        System.out.println("Total vendido: " + totalVendido);
                        System.out.println(tienda.buscaArticulo(codigo));
                    } else {
                        System.out.println("El artículo no está en la lista o no hay suficientes unidades.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}


