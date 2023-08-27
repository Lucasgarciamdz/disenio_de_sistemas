package ejercicio_1a;

import java.util.ArrayList;
import java.util.List;

public class Lados {
    private List<Puntos> puntos;
    private float longitud;

    public Lados(Puntos punto1, Puntos punto2) {
        this.puntos = new ArrayList<>();
        this.puntos.add(punto1);
        this.puntos.add(punto2);
        this.longitud = (float) Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
    }

    public List<Puntos> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Puntos> puntos) {
        this.puntos = puntos;
    }

    public float getLongitud() {
        return longitud;
    }
}
