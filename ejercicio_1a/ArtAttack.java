package ejercicio_1a;

import java.util.ArrayList;
import java.util.List;

public class ArtAttack {

    public static void main(String[] args) {
        Puntos punto1 = new Puntos(0, 0);
        Puntos punto2 = new Puntos(0, 1);
        Puntos punto3 = new Puntos(1, 1);
        Puntos punto4 = new Puntos(1, 0);

        Lados lado1 = new Lados(punto1, punto2);
        Lados lado2 = new Lados(punto2, punto3);
        Lados lado3 = new Lados(punto3, punto4);
        Lados lado4 = new Lados(punto4, punto1);

        List<Lados> lados = new ArrayList<>();
        lados.add(lado1);
        lados.add(lado2);
        lados.add(lado3);
        lados.add(lado4);

        Cuadrado cuadrado2 = new Cuadrado("Cuadrado", lados);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", lados);

        System.out.println("Area: " + cuadrado.calcularArea());
        System.out.println("Perimetro: " + cuadrado.calcularPerimetro());

        cuadrado.agregarFigura(cuadrado2);
    }
}
