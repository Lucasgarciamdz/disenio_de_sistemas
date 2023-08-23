package Hardware;

import java.util.Random;

public class Impresora {
    private String cartucho;
    private String marca;
    Random random = new Random();
    public Impresora(){
    }

    public Impresora(String cartucho, String marca){
        this.cartucho = cartucho;
        this.marca = marca;
    }

    public String getCartucho() {
        return cartucho;
    }

    public void setCartucho(String cartucho) {
        this.cartucho = cartucho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void imprimir(){
        System.out.println("Estoy imprimiendo");
        int num = random.nextInt(2)+1;
        if (num == 1){
            System.out.println("Imprimiendo...");
        }else {
            System.out.println("No hay tinta");
        }
    }
}
