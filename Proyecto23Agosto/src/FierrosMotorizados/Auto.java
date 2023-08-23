package FierrosMotorizados;

import CozyConesMotel.Garage;
import PartesFierros.Llantas;
import PartesFierros.Stereo;

public class Auto extends FierroGeneral{
    private String color;
    private Stereo stereo;
    private Llantas llantas;
    private Garage garage;

    public Auto(Llantas llantas, String modelo, String marca){
        super(marca, modelo);
        this.llantas = llantas;
    }

    public Auto(String marca, String modelo, String color, Stereo stereo, Llantas llantas){
        super(marca, modelo);
        this.color = color;
        this.stereo = stereo;
        this.llantas = llantas;
    }

    public Auto(String marca, String modelo, String color, Stereo stereo, Llantas llantas, Garage garage){
        super(marca, modelo);
        this.color = color;
        this.stereo = stereo;
        this.llantas = llantas;
        this.garage = garage;
    }

    public Auto(String marca, String modelo, String color, Stereo stereo, Llantas llantas, String calle, int numero, int capacidad){
        super(marca, modelo);
        this.color = color;
        this.stereo = stereo;
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

    public Stereo getStereo() {
        return stereo;
    }

    public void setStereo(Stereo stereo) {
        this.stereo = stereo;
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
