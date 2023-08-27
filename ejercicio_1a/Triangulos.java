package ejercicio_1a;

import java.util.List;

public class Triangulos extends Poligonos{

    protected Triangulos(String nombre, List<Lados> lados) {
        super(nombre, lados);
    }

    @Override
    public double calcularArea() {
        return 0; // cada triangulo tiene su propia formula
    }

    @Override
    public double calcularPerimetro() {
        return 0; // cada triangulo tiene su propia formula
    }
}