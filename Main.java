

import java.util.ArrayList;
import java.util.List;
//Tema 2 - Desafio Novato.

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

            p.exibirStatus();
            p.usarHabilidade();

        }

    }
}
