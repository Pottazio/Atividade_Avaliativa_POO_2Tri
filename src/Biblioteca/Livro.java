package Biblioteca;

public class Livro extends Acervo {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado.");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido.");
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}