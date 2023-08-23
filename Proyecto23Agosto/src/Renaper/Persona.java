package Renaper;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    private final List<Domicilio> domicilios = new ArrayList<>();

    public Persona(){
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    public void saltar(){
        System.out.println("Estoy saltando");
    }

    public void hablar(){
        System.out.println("Estoy hablando");
    }

    public void dormir(){
        System.out.println("Estoy durmiendo");
    }

    public void setDomicilio(Domicilio domicilio){

        this.domicilios.add(domicilio);
    }

    public Domicilio getDomicilio(int i){

        return this.domicilios.get(i);
    }

    public void imprimirDomicilio(){

        for (Domicilio domicilio : domicilios) {
            System.out.println("El domicilio de " + this.getNombre() + " es: " + domicilio.getCalle() + " " + domicilio.getNumero());
        }
    }
}
