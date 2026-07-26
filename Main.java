
import java.util.ArrayList;
import java.util.List;
//Tema 2 - Desafio Aventureiro.

public class Main {
    public static void main(String[] args) {

        // Saudação normal do Jogo
        System.out.println("************Bem vindos ao Reino de Eldoria********");
        System.out.println("*************Os Guardiões se preparam para Batalha***********");

        // Array de Herois e as informacoes dos herois sendo introduzidas.
        List<Personagem> herois = new ArrayList<>();
        herois.add(new Guerreiro("Hercules", "Guerreiro", 15, 80, 130));
        herois.add(new Guerreiro("Arthur", "Guerreiro", 15, 80, 130));
        herois.add(new Mago("Circe", "Mago", 20, 80, 180));
        herois.add(new Mago("Elenara", "Mago", 25, 180, 280));

        // Laco escrevendo o resultado dos metodos sendo executados.
        System.out.println("\n\n====================Cadastro de Herois==========================");
        for (Personagem p : herois) {

            System.out.println(p);
            p.usarHabilidade();

            System.out.println("\n>>Verificação do Instanceof: ");

            String nome = p.getNome();
            int nivel = p.getNivel();
            if (p instanceof Guerreiro) {
                System.out.println("O Personagem de nome: " + nome + " é um Guerreiro de Nivel" + nivel);
            } else if (p instanceof Mago) {
                System.out.println("O Personagem de nome: " + nome + " é um Mago de Nivel: " + nivel);

            }

            System.out.println("\n" + "=".repeat(85) + "\n");
        }

        // Demonstrando Equals:
        Personagem p1 = new Guerreiro("Hercules", "Guerreiro", 15, 80, 130);
        Personagem p2 = new Guerreiro("Hercules", "Guerreiro", 15, 80, 130);
        Personagem p3 = new Mago("Circe", "Mago", 20, 80, 180);
        Personagem p4 = new Mago("Elenara", "Mago", 25, 180, 280);

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*= Demonstrando comparação com Equals: *=*=*=*=*=*=*=*=*=*=**=*=\n");
        System.out.println("\nPersonagem 1:\n " + p1);
        System.out.println("\nPersonagem 2:\n" + p2);
        System.out.println("\nPersonagem 3:\n" + p3);
        System.out.println("\nPersonagem 4:\n" + p4);

        System.out.println(
                "\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+Comparando Com Equals...-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+--+-+");
        System.out.println("p1.equals(p2) : " + p1.equals(p2) + " (mesmo nome e classe devem ser iguais)");
        System.out.println("p1.equals(p3) : " + p1.equals(p3) + " (nomes/classes diferentes devem ser diferentes)");
        System.out.println(
                "p3.equals(p4) : " + p3.equals(p4) + " (mesma classe mas nomes diferentes devem ser diferentes)");

        // Demonstrando Hashcodes
        System.out.println("\n*-*-*-*-*-*-*-*-*-**-*-ComparandoHashCodes:*-*-*-*-*-*-*-*-*-*-*-*--*-*");
        System.out.println("p1.hashCode() : " + p1.hashCode());
        System.out.println("p2.hashCode() : " + p2.hashCode());
        System.out.println("p3.hashCode() : " + p3.hashCode());
        System.out.println("p4.hashCode() : " + p4.hashCode());
        System.out.println("p1 e p2 têm o mesmo hashCode?: " + (p1.hashCode() == p2.hashCode()));
        System.out.println("p3 e p4 têm o mesmo hashCode?: " + (p3.hashCode() == p4.hashCode()));

        // compartacoes adicionais entre pernagens da lista original
        System.out.println("\n>>Comparando herios por index com Equals: \n");
        // Compara o herói do índice 0 (Hércules) com o do índice 1 (Arthur)
        if (herois.get(0).equals(herois.get(1))) {
            System.out.println("Os heróis são iguais!");
        } else {
            System.out.println("Os heróis são diferentes!");
        }

        // Comparando os HashCodes de dois heróis da lista
        int hashHeroi0 = herois.get(0).hashCode();
        int hashHeroi1 = herois.get(1).hashCode();

        System.out.println("HashCode do herói 0 (" + herois.get(0).getNome() + "): " + hashHeroi0);
        System.out.println("HashCode do herói 1 (" + herois.get(1).getNome() + "): " + hashHeroi1);

        if (hashHeroi0 == hashHeroi1) {
            System.out.println("Os heróis possuem o mesmo hashCode!");
        } else {
            System.out.println("Os heróis possuem HashCodes diferentes (nomes/classes diferentes).");
        }

        System.out.println("===Fim da lista personagens===");
    }
}
