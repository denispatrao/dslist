package com.denispatrao.dslist.servicos;

import com.denispatrao.dslist.dto.JogoListaDto;
import com.denispatrao.dslist.entidades.JogoLista;
import com.denispatrao.dslist.repositorio.JogoListaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogoListaServico {
    @Autowired
    private JogoListaRepositorio jogoListaRepositorio;

    @Transactional(readOnly = true)
    public List<JogoListaDto> pegarTudo() {
        List<JogoLista> resultado = jogoListaRepositorio.findAll();
        return resultado.stream().map(x -> new JogoListaDto(x)).toList();
    }

}
