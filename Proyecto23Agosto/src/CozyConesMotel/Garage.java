package CozyConesMotel;

public class Garage {

    private String calle;
    private int numero;

    private int capacidad;

    public Garage(){
    }

    public Garage(String calle, int numero, int capacidad){
        this.calle = calle;
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
