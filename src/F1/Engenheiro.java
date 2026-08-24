package F1;

public class Engenheiro extends Pessoa {
    Piloto piloto;

    Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto) {
        super(nome, idade, nacionalidade);
        this.piloto = piloto;
    }

    void mostra() {
        super.mostra();
        if(piloto != null) {
            System.out.println("Trabalha com: " + piloto.nome);
        } else {
            System.out.println("Ta sem piloto ainda");
        }
    }
}