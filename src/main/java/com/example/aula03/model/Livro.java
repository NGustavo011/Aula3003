package com.example.aula03.model;

/**
 * Livro
 */
public class Livro {

    private String nome;
    private String autor;
    private String edicao;
    private double preco;
    private int paginas;


    public Livro(String nome, String autor, String edicao, double preco, int paginas) {

        this.nome = nome;
        this.autor = autor;
        this.edicao = edicao;
        this.preco = preco;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


}