package Renaper;

public class Domicilio {

    private String calle;
    private String numero;

    private Persona persona;

    public Domicilio(){
    }

    public Domicilio(String calle, String numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void getPersona(){
        System.out.println("La persona es: " + persona.getNombre() + " " + persona.getApellido());
    }

    public void setPersona(Persona persona){
        this.persona = persona;
    }
}
