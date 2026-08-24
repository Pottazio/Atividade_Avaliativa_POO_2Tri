import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = teclado.nextDouble();
        }
    }

    public double calculaMedia() {
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }

        return soma / 5;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double menorNota() {
        double menor = notas[0];

        for (int i = 1; i < 5; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }
}