//Tema2 - Desafio Novato

public class Mago extends Personagem{

    //Construtor da Classe Mago
    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        //Chamando os atributos da Super Classe.
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }

    //Metodo Abstrato sendo implementado na Classe Mago
    @Override
    public void usarHabilidade() {
        // TODO Auto-generated method stub
        System.out.println("Habilidade do Mago(a): "+this.getNome());
        System.out.println("O mago " + this.getNome() + " usa sua habilidade especial: Bola de Fogo!\n");
        
    }
    
}
