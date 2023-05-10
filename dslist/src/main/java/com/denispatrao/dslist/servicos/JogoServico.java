package com.denispatrao.dslist.servicos;

import com.denispatrao.dslist.dto.JogoMiniDto;
import com.denispatrao.dslist.entidades.Jogo;
import com.denispatrao.dslist.repositorio.JogoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoServico {
    @Autowired
    private JogoRepositorio jogoRepositorio;

    public List<JogoMiniDto> pegarTudo() {

        List<Jogo> resultado = jogoRepositorio.findAll();
        return resultado.stream().map(x -> new JogoMiniDto(x)).toList();

    }

}
