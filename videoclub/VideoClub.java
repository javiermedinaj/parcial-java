package videoclub;

import java.util.ArrayList;

public class VideoClub {
    private ArrayList<Película> accion;
    private ArrayList<Película> suspenso;
    private ArrayList<Película> comedia;
    private ArrayList<Película> drama;

    public VideoClub() {
        accion = new ArrayList<>();
        suspenso = new ArrayList<>();
        comedia = new ArrayList<>();
        drama = new ArrayList<>();
    }

    public boolean añadePelícula(Película película, String género) {
        if (buscaPelícula(película.getTítulo(), género) == null) {
            switch (género.toLowerCase()) {
                case "accion":
                    accion.add(película);
                    break;
                case "suspenso":
                    suspenso.add(película);
                    break;
                case "comedia":
                    comedia.add(película);
                    break;
                case "drama":
                    drama.add(película);
                    break;
                default:
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }

    private Película buscaPelícula(String título, String género) {
        ArrayList<Película> lista = getListaPorGénero(género);
        if (lista != null) {
            for (Película p : lista) {
                if (p.getTítulo().equalsIgnoreCase(título)) {
                    return p;
                }
            }
        }
        return null;
    }

    public boolean prestaPelícula(String título, String género, String cliente) {
        Película película = buscaPelícula(título, género);
        if (película != null) {
            película.presta(cliente);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminaPelícula(String título, String género) {
        ArrayList<Película> lista = getListaPorGénero(género);
        Película película = buscaPelícula(título, género);
        if (película != null) {
            lista.remove(película);
            return true;
        } else {
            return false;
        }
    }

    public boolean devuelvePelícula(String título, String género) {
        Película película = buscaPelícula(título, género);
        if (película != null) {
            película.devuelve();
            return true;
        } else {
            return false;
        }
    }

    private ArrayList<Película> getListaPorGénero(String género) {
        switch (género.toLowerCase()) {
            case "accion":
                return accion;
            case "suspenso":
                return suspenso;
            case "comedia":
                return comedia;
            case "drama":
                return drama;
            default:
                return null;
        }
    }
}