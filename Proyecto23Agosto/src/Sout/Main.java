package Sout;

import Hardware.CPU;
import Hardware.Computadora;
import Hardware.Impresora;
import Renaper.Domicilio;
import Renaper.Persona;

public class Main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", "12345678");

        System.out.println("El nombre de la persona es: " + persona1.getNombre() + " " + persona1.getApellido());

        Domicilio domicilio1 = new Domicilio("Av. Siempreviva", "742");

        System.out.println("El domicilio de la persona es: " + domicilio1.getCalle() + " " + domicilio1.getNumero());

        persona1.setDomicilio(domicilio1);

        System.out.println("El domicilio de " + persona1.getNombre() + " es: " + persona1.getDomicilio(0).getCalle() + " " + persona1.getDomicilio(0).getNumero());

        CPU cpu1 = new CPU("apple", "m2 ultra");

        System.out.println("La CPU es: " + cpu1.getMarca() + " " + cpu1.getModelo());

        Computadora compu1 = new Computadora("apple", "100000000", "gris", cpu1);

        System.out.println("La computadora es: " + compu1.getMarca() + " " + compu1.getPrecio() + " " + compu1.getColor() + " " + compu1.getCpu().getMarca() + " " + compu1.getCpu().getModelo());

        Impresora impresora1 = new Impresora("LaserJet", "HP");

        System.out.println("La impresora es: " + impresora1.getMarca() + " " + impresora1.getCartucho());

        compu1.setImpresora(impresora1);

        compu1.getImpresora().imprimir();
    }
}