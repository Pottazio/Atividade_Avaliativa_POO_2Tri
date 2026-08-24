package Metodo;

public class Metodo {
    public static Estudante.Estudante[] aprovados(Estudante.Estudante[] estudantes) {
        int quantidade = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                quantidade++;
            }
        }

        if (quantidade == 0) {
            return null;
        }

        Estudante.Estudante[] aprovados = new Estudante.Estudante[quantidade];

        int posicao = 0;

        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i].calculaMedia() >= 6) {
                aprovados[posicao] = estudantes[i];
                posicao++;
            }
        }

        return aprovados;
    }
}