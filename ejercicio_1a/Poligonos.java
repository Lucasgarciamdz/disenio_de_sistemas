package ejercicio_1a;

public class Poligonos{

    protected int[][] lados;

    public Poligonos(int[] x, int[] y) {
        int n = x.length;
        this.lados = new int[n][2];
        for (int i = 0; i < n; i++) {
            this.lados[i][0] = x[i];
            this.lados[i][1] = y[i];
        }
    }

}