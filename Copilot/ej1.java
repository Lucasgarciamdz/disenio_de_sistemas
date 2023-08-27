//package Copilot;
//
//import java.util.List;
//
//public class ej1 {
//    public abstract class Figura {
//        private String nombre;
//        private List<Figura> figuras;
//
//        public Figura(String nombre) {
//            this.nombre = nombre;
//            this.figuras = new ArrayList<>();
//        }
//
//        public void agregarFigura(Figura figura) {
//            figuras.add(figura);
//        }
//
//        public abstract double calcularArea();
//
//        public abstract double calcularPerimetro();
//    }
//
//    public abstract class Poligono extends Figura {
//        private int numeroLados;
//        private List<Punto> puntos;
//
//        public Poligono(String nombre, int numeroLados) {
//            super(nombre);
//            this.numeroLados = numeroLados;
//            this.puntos = new ArrayList<>();
//        }
//
//        public void agregarPunto(Punto punto) {
//            puntos.add(punto);
//        }
//
//        public int getNumeroLados() {
//            return numeroLados;
//        }
//
//        public List<Punto> getPuntos() {
//            return puntos;
//        }
//    }
//
//    public class Triangulo extends Poligono {
//        public Triangulo(String nombre, Punto punto1, Punto punto2, Punto punto3) {
//            super(nombre, 3);
//            agregarPunto(punto1);
//            agregarPunto(punto2);
//            agregarPunto(punto3);
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de un triángulo
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de un triángulo
//        }
//    }
//
//    public class Cuadrilatero extends Poligono {
//        public Cuadrilatero(String nombre, Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
//            super(nombre, 4);
//            agregarPunto(punto1);
//            agregarPunto(punto2);
//            agregarPunto(punto3);
//            agregarPunto(punto4);
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de un cuadrilátero
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de un cuadrilátero
//        }
//    }
//
//    public class Rectangulo extends Cuadrilatero {
//        public Rectangulo(String nombre, Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
//            super(nombre, punto1, punto2, punto3, punto4);
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de un rectángulo
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de un rectángulo
//        }
//    }
//
//    public class Cuadrado extends Rectangulo {
//        public Cuadrado(String nombre, Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
//            super(nombre, punto1, punto2, punto3, punto4);
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de un cuadrado
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de un cuadrado
//        }
//    }
//
//    public class Elipse extends Figura {
//        private double semiejeMayor;
//        private double semiejeMenor;
//
//        public Elipse(String nombre, double semiejeMayor, double semiejeMenor) {
//            super(nombre);
//            this.semiejeMayor = semiejeMayor;
//            this.semiejeMenor = semiejeMenor;
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de una elipse
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de una elipse
//        }
//    }
//
//    public class Circulo extends Elipse {
//        public Circulo(String nombre, double radio) {
//            super(nombre, radio, radio);
//        }
//
//        @Override
//        public double calcularArea() {
//            // Implementar cálculo del área de un círculo
//        }
//
//        @Override
//        public double calcularPerimetro() {
//            // Implementar cálculo del perímetro de un círculo
//        }
//    }
//
//    public class Punto {
//        private double x;
//        private double y;
//
//        public Punto(double x, double y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        public double getX() {
//            return x;
//        }
//
//        public double getY() {
//            return y;
//        }
//    }
//}
