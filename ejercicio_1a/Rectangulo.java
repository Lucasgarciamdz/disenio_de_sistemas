package ejercicio_1a;

import java.util.List;

public class Rectangulo extends Cuadrilateros {
    protected Rectangulo(String nombre, List<Lados> lados) {
        super(nombre, lados);
    }

    @Override
    public double calcularArea() {
        float base = this.getLados().get(0).getLongitud();
        float altura = 0;
        altura = this.getLados().get(1).getLongitud() == base ? this.getLados().get(2).getLongitud() : this.getLados().get(1).getLongitud();
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        for (Lados lado : this.getLados()) {
            if (lado.getLongitud() != this.getLados().get(0).getLongitud()) {
                return this.getLados().get(0).getLongitud() * 2 + this.getLados().get(1).getLongitud() * 2;
            } else {
                return this.getLados().get(0).getLongitud() * 4;
            }
        }
        return 0;
    }
}
