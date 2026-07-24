
//Tema2 - Desafio Novato

public abstract class Personagem {
    // Declarando Variaveis privadas
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor de Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Criando o Gets para pegar os dados das variaveis privadas
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Criandos os metodos Set para inserir dados nas variaveis privadas
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

    // Metodo Abstrato para Criar nas Subclasses.
    public abstract void usarHabilidade();

    // Metodo para Exibir o Status
    public void exibirStatus() {
        System.out.println(this.getClass().getSimpleName()+": ");
        System.out.println("\nNome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase + "\n");

    }

}
