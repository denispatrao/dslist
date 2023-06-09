package com.denispatrao.dslist.entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tabela_jogo_lista")
public class JogoLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public JogoLista() {
    }

    public JogoLista(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JogoLista jogoLista = (JogoLista) o;
        return Objects.equals(id, jogoLista.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
