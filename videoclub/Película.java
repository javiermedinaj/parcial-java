package videoclub;

public class Película {
    private String título;
    private String nombreCliente;

    public Película(String título) {
        this.título = título;
        this.nombreCliente = "";
    }

    public String getTítulo() {
        return título;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void presta(String cliente) {
        if (nombreCliente.isEmpty()) {
            nombreCliente = cliente;
            System.out.println("La película \"" + título + "\" fue prestada a " + cliente + ".");
        } else {
            System.out.println("La película \"" + título + "\" ya está prestada a " + nombreCliente + ".");
        }
    }

    public void devuelve() {
        if (!nombreCliente.isEmpty()) {
            System.out.println("La película \"" + título + "\" fue devuelta por " + nombreCliente + ".");
            nombreCliente = "";
        } else {
            System.out.println("La película \"" + título + "\" no está prestada.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + título + ", Prestada a: " + (nombreCliente.isEmpty() ? "Ninguno" : nombreCliente);
    }
}