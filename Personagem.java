//Tema2 - Desafio Aventureiro

import java.util.Objects;


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
        if (nome != null && nome.trim().isEmpty()) {
            this.nome = nome;
        }
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

    // Metodo para Criar nas Subclasses.
    public void usarHabilidade() {

    }

    // Metodo Equals sobrescrito comparando o nome e classe pra diferenciar os
    // pernagens
    @Override
    public boolean equals(Object obj) {
        // 1. Verifica se é a mesma referência na memória
        if (this == obj) {
            return true;
        }

        // 2. Retorna false se o objeto for nulo ou de outra classe
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Converte e compara os atributos relevantes (consistente com hashCode)
        Personagem outroPesonagem = (Personagem) obj;
        return Objects.equals(this.nome, outroPesonagem.nome) &&
                Objects.equals(this.classe, outroPesonagem.classe);
    }

    // Metodo hashCode Sobrescrito comparando nome e classe seguindo o contrato com
    // equals
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(nome, classe);

    }

    // Metodo toString sobreescrito e formatado.
    @Override
    public String toString() {
        return String.format("\n%s\n\nNome: %s\nClasse: %s\nNível: %d\nPontos de Vida: %d\nPoder Base: %.2f",
                this.getClass().getSimpleName(), nome, classe, nivel, pontosDeVida, poderBase);
    }
}
