package Biblioteca;

public class Periodico extends Biblioteca.Acervo {
    private int numeroVolume;

    public Periodico(String titulo, int numeroVolume) {
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

    public int getNumeroVolume() {
        return numeroVolume;
    }
}