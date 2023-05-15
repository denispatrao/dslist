package com.denispatrao.dslist.dto;

import com.denispatrao.dslist.entidades.JogoLista;

public class JogoListaDto {

    private Long id;
    private String nome;

    public JogoListaDto() {
    }

    public JogoListaDto(JogoLista entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


}
