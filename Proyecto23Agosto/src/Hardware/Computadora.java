package Hardware;

public class Computadora {
    private String marca;
    private String precio;
    private  String color;
    private CPU cpu;
    private Impresora impresora;

    public Computadora(CPU cpu){
        this.cpu = cpu;
    }

    public Computadora(String marca, String precio, String color, CPU cpu, Impresora impresora){
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.cpu = cpu;
        this.impresora = impresora;
    }
    public Computadora(String marca, String precio, String color, CPU cpu){
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.cpu = cpu;
    }

    public Computadora(String marca, String precio, String color, String marcaCpu, String modeloCpu){
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.cpu = new CPU(marcaCpu, modeloCpu);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }
}
