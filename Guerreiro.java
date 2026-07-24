
public class Guerreiro extends Personagem {
    //Contrutor da Classe Guerreiro.

    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        //Chamando os atributos da Super Classe.
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }

    // Com a variável privada é necessario acessar pelo Get
//Metodo Abstrato sendo implementado na Classe Guerreito
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade do Guerreiro: " + this.getNome());
        System.out.println("Guerreiro " + this.getNome() + " ataca com Espada Flamejante!\n");
    }
}