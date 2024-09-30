package parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tienda");
        tienda.agregarALaLista(new Articulo("A001", 10, 5.0));
        tienda.agregarALaLista(new Articulo("A002", 20, 3.0));
        tienda.agregarALaLista(new Articulo("A003", 5, 10.0));

        System.out.println("Mi tienda de articulos \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código del artículo para mostrar sus datos:");
        String codigo = scanner.nextLine();
        Articulo articulo = tienda.buscaArticulo(codigo);
        if (articulo != null) {
            System.out.println(articulo);
        } else {
            System.out.println("Artículo no encontrado.");
        }

        System.out.println("Ingrese el código del artículo para vender:");
        codigo = scanner.nextLine();
        System.out.println("Ingrese la cantidad a vender:");
        int cantidad = scanner.nextInt();
        double total = tienda.vende(codigo, cantidad);
        if (total > 0) {
            System.out.println("Total vendido: " + total);
            System.out.println(tienda.buscaArticulo(codigo));
        } else {
            System.out.println("Artículo no encontrado o cantidad insuficiente.");
        }

        scanner.close();
    }
}