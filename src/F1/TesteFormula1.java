package F1;

public class TesteFormula1 {
    public static void main(String[] args) {

        // CRIANDO OS PATROCINADORES
        Patrocinador tigrinho = new Patrocinador("Tigrinho", 50000000);
        Patrocinador supercell = new Patrocinador("Supercell", 30000000);
        Patrocinador konami = new Patrocinador("Konami", 80000000);
        Patrocinador freefire = new Patrocinador("Free fire", 45000000);
        Patrocinador hamburguerSergio = new Patrocinador("hamburgueria do sérgio", 60000000);

        // CRIANDO EQUIPES
        Equipe ferrari = new Equipe("Ferrari do Tigrinho", 1950);
        ferrari.addPatrocinador(tigrinho);
        ferrari.addPatrocinador(supercell);
        ferrari.addPatrocinador(hamburguerSergio);

        Equipe redBull = new Equipe("Red Bull Konami", 2005);
        redBull.addPatrocinador(konami);
        redBull.addPatrocinador(freefire);

        Equipe mercedes = new Equipe("Mercedes Hamburgueria", 2010);
        mercedes.addPatrocinador(hamburguerSergio);
        mercedes.addPatrocinador(tigrinho);

        // CRIANDO PILOTOS
        Piloto leclerc = new Piloto("Charles Leclerc", 26, "Monegasco", 6);
        Piloto verstappen = new Piloto("Max Verstappen", 26, "Holandes", 56);
        Piloto hamilton = new Piloto("Lewis Hamilton", 39, "Britanico", 105);

        // CRIANDO ENGENHEIROS
        Engenheiro eng1 = new Engenheiro("Xavi", 38, "Espanhol", leclerc);
        Engenheiro eng2 = new Engenheiro("Gianpiero", 42, "Britanico", verstappen);
        Engenheiro eng3 = new Engenheiro("Bono", 49, "Britanico", hamilton);

        // CRIANDO CARROS
        CarroF1 carro1 = new CarroF1(16, 3, ferrari, leclerc);
        CarroF1 carro2 = new CarroF1(1, 1, redBull, verstappen);
        CarroF1 carro3 = new CarroF1(44, 2, mercedes, hamilton);

        // EXIBINDO TUDO
        System.out.println("=== FORMULA 1 DO TIGRINHO ===");
        System.out.println();

        carro1.mostra();
        System.out.println();
        carro2.mostra();
        System.out.println();
        carro3.mostra();

        System.out.println("\n=== ENGENHEIROS ===");
        eng1.mostra();
        System.out.println();
        eng2.mostra();
        System.out.println();
        eng3.mostra();

        System.out.println("\n=== PATROCINIOS ===");
        System.out.println("Total Ferrari: R$ " + ferrari.totalPatrocinio());
        System.out.println("Total Red Bull: R$ " + redBull.totalPatrocinio());
        System.out.println("Total Mercedes: R$ " + mercedes.totalPatrocinio());

        System.out.println("\nFIM");
    }
}