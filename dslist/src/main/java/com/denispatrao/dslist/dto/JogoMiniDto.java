package com.denispatrao.dslist.dto;

import com.denispatrao.dslist.entidades.Jogo;
import com.denispatrao.dslist.projetos.JogoMiniProjeto;

public class JogoMiniDto {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoCurta;

    public JogoMiniDto() {
    }

    //para não ter que inserir os dados de novo, eu pego os dados ja setados na classe Jogo
    //colocando a classe Jogo com dando o nome de entidade e faço o get das informações
    public JogoMiniDto(Jogo entidade) {
        id = entidade.getId();
        titulo = entidade.getTitulo();
        ano = entidade.getAno();
        imgUrl = entidade.getImgUrl();
        descricaoCurta = entidade.getDescricaoCurta();
    }

    public JogoMiniDto(JogoMiniProjeto projecao) {
        id = projecao.getId();
        titulo = projecao.getTitulo();
        ano = projecao.getAno();
        imgUrl = projecao.getImgUrl();
        descricaoCurta = projecao.getDescricaoCurta();
    }


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}
