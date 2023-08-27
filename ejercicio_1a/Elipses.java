package ejercicio_1a;

public abstract class Elipses extends Figura{
    private float semiEjeMayor;
    private float semiEjeMenor;
    private float centro;

    protected Elipses(String nombre) {
        super(nombre);
    }

    public double area() {

        return Math.PI * semiEjeMayor * semiEjeMenor;
    }

    public double perimetro() {
        return 2 * Math.PI * Math.sqrt((Math.pow(semiEjeMayor, 2) + Math.pow(semiEjeMenor, 2)) / 2);
    }

    public float getSemiEjeMayor() {
        return semiEjeMayor;
    }

    public void setSemiEjeMayor(float semiEjeMayor) {
        this.semiEjeMayor = semiEjeMayor;
    }

    public float getSemiEjeMenor() {
        return semiEjeMenor;
    }

    public void setSemiEjeMenor(float semiEjeMenor) {
        this.semiEjeMenor = semiEjeMenor;
    }

    public float getCentro() {
        return centro;
    }

    public void setCentro(float centro) {
        this.centro = centro;
    }
}
