package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFianl = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>(); //Não fica em ordem, sendo unico cadastro
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); //Fica em ordem, sendo unico cadastro

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFianl() {
        return dataFianl;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override //Utilizado para o LinkedHashSet
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFianl, bootcamp.dataFianl) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override //Utilizado para o LinkedHashSet
    public int hashCode() {
        return Objects.hash(nome, dataInicial, dataFianl, devsInscritos, conteudos);
    }
}