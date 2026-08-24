public class CarroF1 {
    int numero;
    int posicao;
    Equipe equipe;
    Piloto piloto;

    CarroF1(int numero, int posicao, Equipe equipe, Piloto piloto) {
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
    }

    void mostra() {
        System.out.println("\n========== CARRO ==========");
        System.out.println("Numero: " + numero);
        System.out.println("Posicao: " + posicao + "º");
        System.out.println("Equipe: " + equipe.nome);
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Vitorias do piloto: " + piloto.vitorias);
    }
}