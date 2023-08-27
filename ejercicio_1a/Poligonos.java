package ejercicio_1a;

import java.util.List;

public abstract class Poligonos extends Figura {

    private List<Lados> lados;
    private int numeroLados;

    protected Poligonos(String nombre, List<Lados> lados) {
        super(nombre);
        this.numeroLados = lados.size();
        this.lados = lados;
    }

    public List<Lados> getLados() {
        return lados;
    }

    public void setLados(List<Lados> lados) {
        this.lados = lados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

}