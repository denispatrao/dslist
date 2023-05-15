package com.denispatrao.dslist.servicos;

import com.denispatrao.dslist.dto.JogoDto;
import com.denispatrao.dslist.dto.JogoMiniDto;
import com.denispatrao.dslist.entidades.Jogo;
import com.denispatrao.dslist.repositorio.JogoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogoServico {
    @Autowired
    private JogoRepositorio jogoRepositorio;

    //criando método para buscar o id do JogoDto
    @Transactional(readOnly = true)
    public JogoDto procurarPorId(Long id) {
        Jogo resultado = jogoRepositorio.findById(id).get();
        return new JogoDto(resultado);
    }

    @Transactional(readOnly = true)
    public List<JogoMiniDto> pegarTudo() {
        List<Jogo> resultado = jogoRepositorio.findAll();
        return resultado.stream().map(x -> new JogoMiniDto(x)).toList();
    }

}
