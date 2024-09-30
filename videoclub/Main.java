package videoclub;

public class Main {
    public static void main(String[] args) {
        VideoClub videoClub = new VideoClub();

        Película p1 = new Película("Rápido y Furioso 9");
        Película p2 = new Película("El Origen");
        Película p3 = new Película("La Mascara");
        Película p4 = new Película("El Padrino");

        videoClub.añadePelícula(p1, "accion");
        videoClub.añadePelícula(p2, "suspenso");
        videoClub.añadePelícula(p3, "comedia");
        videoClub.añadePelícula(p4, "drama");

        videoClub.prestaPelícula("El Origen", "suspenso", "Juan Perez");
        videoClub.prestaPelícula("El Origen", "suspenso", "Ana Martinez");
        videoClub.devuelvePelícula("El Origen", "suspenso");
        videoClub.eliminaPelícula("El Padrino", "drama");
        videoClub.eliminaPelícula("El Padrino", "drama");
    }
}