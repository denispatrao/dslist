package com.denispatrao.dslist.controle;

import com.denispatrao.dslist.dto.JogoListaDto;
import com.denispatrao.dslist.servicos.JogoListaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/listas")
public class JogoListaControle {
    @Autowired
    private JogoListaServico jogoListaServico;


    @GetMapping
    public List<JogoListaDto> pegarTudo() {
        List<JogoListaDto> resultado = jogoListaServico.pegarTudo();
        return resultado;

    }


}
