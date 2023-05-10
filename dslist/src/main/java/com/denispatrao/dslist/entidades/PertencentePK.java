package com.denispatrao.dslist.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class PertencentePK {
    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;
    @ManyToOne
    @JoinColumn(name = "lista_id")
    private JogoLista jogoLista;

    public PertencentePK() {
    }

    public PertencentePK(Jogo jogo, JogoLista jogoLista) {
        this.jogo = jogo;
        this.jogoLista = jogoLista;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public JogoLista getJogoLista() {
        return jogoLista;
    }

    public void setJogoLista(JogoLista jogoLista) {
        this.jogoLista = jogoLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PertencentePK that = (PertencentePK) o;
        return Objects.equals(jogo, that.jogo) && Objects.equals(jogoLista, that.jogoLista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jogo, jogoLista);
    }
}
