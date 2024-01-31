package com.example.cinereview.model;

import jakarta.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nome;
    private String diretor;
    private String ano;
    private String avaliacao;

    public Livro(Long id, String nome, String diretor, String ano, String avaliacao) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public Livro (){}

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
