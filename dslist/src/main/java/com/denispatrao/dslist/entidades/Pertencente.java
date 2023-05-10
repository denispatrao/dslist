package com.denispatrao.dslist.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tabela_pertencente")
public class Pertencente {
    //essas duas classes abaixo a Jogo e a JogoLista, não podem ter dois atributos com chave primária pras duas,
    // devemos criar uma classe auxiliar
    //chave primaria pra poder elas obterem uma só chave primária, aí ela deixará de ter Jogo e JogoLista para ter apenas
    //o atributo abaixo:
    @EmbeddedId
    private PertencentePK id = new PertencentePK();
    private Integer posicao;

    public Pertencente() {
    }

    public Pertencente(Jogo jogo, JogoLista jogoLista, Integer posicao) {
        id.setJogo(jogo);
        id.setJogoLista(jogoLista);
        this.posicao = posicao;
    }

    public PertencentePK getId() {
        return id;
    }

    public void setId(PertencentePK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pertencente that = (Pertencente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
