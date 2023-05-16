package com.denispatrao.dslist.controle;

import com.denispatrao.dslist.dto.JogoListaDto;
import com.denispatrao.dslist.dto.JogoMiniDto;
import com.denispatrao.dslist.servicos.JogoListaServico;
import com.denispatrao.dslist.servicos.JogoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listas")
public class JogoListaControle {
    @Autowired
    private JogoListaServico jogoListaServico;
    @Autowired
    private JogoServico jogoServico;


    @GetMapping
    public List<JogoListaDto> pegarTudo() {
        List<JogoListaDto> resultado = jogoListaServico.pegarTudo();
        return resultado;

    }

    @GetMapping(value = "/{listaId}/jogos")
    public List<JogoMiniDto> procurarPorLista(@PathVariable Long listaId) {
        List<JogoMiniDto> resultado = jogoServico.procurarPorLista(listaId);
        return resultado;

    }


}
