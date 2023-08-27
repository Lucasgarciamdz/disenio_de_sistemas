package ejercicio_1a;

public class Circulo extends Elipses {

    protected Circulo(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.getSemiEjeMayor(), 2);
    }


    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.getSemiEjeMayor();
    }
}
