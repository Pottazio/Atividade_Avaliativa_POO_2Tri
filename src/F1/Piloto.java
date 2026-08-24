package F1;

public class Piloto extends Pessoa {
    int vitorias;

    Piloto(String nome, int idade, String nacionalidade, int vitorias) {
        super(nome, idade, nacionalidade);
        this.vitorias = vitorias;
    }

    void mostra() {
        super.mostra();
        System.out.println("Vitórias: " + vitorias);
    }
}