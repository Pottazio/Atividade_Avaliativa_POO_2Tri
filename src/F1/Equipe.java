import java.util.ArrayList;

public class Equipe {
    String nome;
    int ano;
    ArrayList patrocinadores;

    Equipe(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        this.patrocinadores = new ArrayList();
    }

    void addPatrocinador(Patrocinador p) {
        patrocinadores.add(p);
    }

    void mostra() {
        System.out.println("Equipe: " + nome + " (" + ano + ")");
        System.out.println("Patrocinadores:");
        if(patrocinadores.size() == 0) {
            System.out.println("  Nenhum :(");
        } else {
            for(int i = 0; i < patrocinadores.size(); i++) {
                Patrocinador p = (Patrocinador) patrocinadores.get(i);
                p.mostra();
            }
        }
    }

    double totalPatrocinio() {
        double total = 0;
        for(int i = 0; i < patrocinadores.size(); i++) {
            Patrocinador p = (Patrocinador) patrocinadores.get(i);
            total = total + p.valor;
        }
        return total;
    }
}