package ejercicio_1a;

import java.util.List;

public class Cuadrado extends Cuadrilateros{
    protected Cuadrado(String nombre, List<Lados> lados) {
        super(nombre, lados);
    }

    @Override
    public double calcularArea() {
        return this.getLados().get(0).getLongitud() * this.getLados().get(0).getLongitud();
    }

    @Override
    public double calcularPerimetro() {
        return this.getLados().get(0).getLongitud() * 4;
    }
}
