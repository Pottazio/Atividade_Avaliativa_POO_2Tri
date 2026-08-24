/**
 * Classe que representa uma lâmpada com controle de estado (acesa/apagada)
 * e potência (watts).
 */
public class Lampada {
    private boolean acesa;  // Estado da lâmpada
    private int watts;      // Potência em watts

    // ========== CONSTRUTORES ==========

    /**
     * Construtor que recebe APENAS o estado inicial (requisito obrigatório)
     * @param estadoInicial true = acesa, false = apagada
     */
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
        this.watts = 60;  // valor padrão
    }

    /**
     * Construtor que recebe apenas os watts (a lâmpada começa apagada)
     * @param watts potência da lâmpada
     */
    public Lampada(int watts) {
        this.acesa = false;  // por padrão, apagada
        setWatts(watts);     // usa o set para validar
    }

    /**
     * Construtor padrão: 60 watts e lâmpada apagada
     */
    public Lampada() {
        this.acesa = false;
        this.watts = 60;
    }

    // ========== GETTERS E SETTERS ==========

    /**
     * GET para watts - retorna a potência atual
     * @return potência em watts
     */
    public int getWatts() {
        return watts;
    }

    /**
     * SET para watts - garante que esteja entre 1 e 1000
     * @param watts potência desejada
     */
    public void setWatts(int watts) {
        if (watts < 1) {
            this.watts = 1;
        } else if (watts > 1000) {
            this.watts = 1000;
        } else {
            this.watts = watts;
        }
    }

    /**
     * GET para o estado da lâmpada
     * @return true se acesa, false se apagada
     */
    public boolean isAcesa() {
        return acesa;
    }

    // ========== MÉTODOS PRINCIPAIS ==========

    /**
     * Troca o estado da lâmpada e exibe mensagem
     */
    public void interruptor() {
        acesa = !acesa;
        if (acesa) {
            System.out.println("A lâmpada foi acesa.");
        } else {
            System.out.println("A lâmpada foi apagada.");
        }
    }

    /**
     * Exibe o estado atual da lâmpada (acesa ou apagada)
     */
    public void exibirEstado() {
        if (acesa) {
            System.out.println("A lâmpada está acesa no momento.");
        } else {
            System.out.println("A lâmpada está apagada no momento.");
        }
    }

    /**
     * Exibe a potência atual da lâmpada
     */
    public void exibirWatts() {
        System.out.println("A quantidade de watts é: " + watts);
    }
}

/**
 * Classe de teste
 */
class Lampada3 {
    public static void main(String[] args) {
        System.out.println("=== TESTES DA CLASSE LAMPADA ===\n");

        // Teste 1: Construtor com estado inicial
        System.out.println("--- Teste 1: Construtor com estado inicial (false) ---");
        Lampada lamp1 = new Lampada(false);
        lamp1.exibirEstado();
        lamp1.exibirWatts();

        System.out.println("\n--- Teste 2: Testando interruptor ---");
        System.out.print("Estado inicial: ");
        lamp1.exibirEstado();
        lamp1.interruptor();   // Acende
        System.out.print("Após interruptor: ");
        lamp1.exibirEstado();

        System.out.println("\n--- Teste 3: SetWatts com validação ---");
        System.out.print("Watts atual: " + lamp1.getWatts());
        System.out.print("\nTentando setar 2000: ");
        lamp1.setWatts(2000);
        System.out.println("Resultado: " + lamp1.getWatts() + " watts");

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}