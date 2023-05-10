package com.denispatrao.dslist.controle;

import com.denispatrao.dslist.dto.JogoMiniDto;
import com.denispatrao.dslist.entidades.Jogo;
import com.denispatrao.dslist.servicos.JogoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/jogo")
public class JogoControle {
    @Autowired
    private JogoServico jogoServico;

    @GetMapping
    public List<JogoMiniDto> pegarTudo() {
        List<JogoMiniDto> resultado = jogoServico.pegarTudo();
        return resultado;

    }


}
