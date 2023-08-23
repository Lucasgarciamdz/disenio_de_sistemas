package FierrosMotorizados;

public abstract class FierroGeneral {

    protected String marca;

    protected String modelo;

    protected FierroGeneral(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar();

    public abstract void frenar();

    public abstract void arrancar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
