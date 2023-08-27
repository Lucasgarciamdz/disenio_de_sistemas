package ejercicio_1a;

import java.util.ArrayList;
import java.util.List;

public abstract class Figura {

    private String nombre;
    private final List<Figura> figuras;

    protected Figura(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
