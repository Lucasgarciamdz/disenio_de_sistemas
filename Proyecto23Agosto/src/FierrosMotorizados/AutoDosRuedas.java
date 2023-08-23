package FierrosMotorizados;

import CozyConesMotel.Garage;
import PartesFierros.Llantas;
import PartesFierros.Stereo;

public class AutoDosRuedas extends FierroGeneral {
    private String color;
    private Llantas llantas;

    private Garage garage;


    public AutoDosRuedas(Llantas llantas, String modelo, String marca){
        super(marca, modelo);
        this.llantas = llantas;
    }

    public AutoDosRuedas(String marca, String modelo, String color, Llantas llantas){
        super(marca, modelo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.llantas = llantas;
    }

    public AutoDosRuedas(String marca, String modelo, String color, Llantas llantas, Garage garage){
        super(marca, modelo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.llantas = llantas;
        this.garage = garage;
    }

    public AutoDosRuedas(String marca, String modelo, String color, Llantas llantas, String calle, int numero, int capacidad){
        super(marca, modelo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.llantas = llantas;
        this.garage = new Garage(calle, numero, capacidad);
    }


    @Override
    public void acelerar() {

    }

    @Override
    public void frenar() {

    }

    @Override
    public void arrancar() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llantas getLlantas() {
        return llantas;
    }

    public void setLlantas(Llantas llantas) {
        this.llantas = llantas;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }
}
