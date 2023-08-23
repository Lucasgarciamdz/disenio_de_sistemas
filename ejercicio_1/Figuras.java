package ejercicio_1;

public abstract class Figuras {
    
    String nombre;

    protected Figuras(String nombre) {
        this.nombre = nombre;
    }


    public abstract double area();

    public abstract double perimetro();
}
