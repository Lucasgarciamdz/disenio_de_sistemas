package PartesFierros;

public class Llantas {

    private String medida;
    private String marca;

    private String aire;

    public Llantas(){
    }

    public Llantas(String medida, String marca, String aire){
        this.medida = medida;
        this.marca = marca;
        this.aire = aire;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }
}
