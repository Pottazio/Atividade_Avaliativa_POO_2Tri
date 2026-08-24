package F1;

public class Patrocinador {
    String nome;
    double valor;

    Patrocinador(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    void mostra() {
        System.out.println("  " + nome + " - R$ " + valor);
    }
}