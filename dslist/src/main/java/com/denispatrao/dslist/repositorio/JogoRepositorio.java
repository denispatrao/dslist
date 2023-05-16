package com.denispatrao.dslist.repositorio;

import com.denispatrao.dslist.entidades.Jogo;
import com.denispatrao.dslist.projetos.JogoMiniProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogoRepositorio extends JpaRepository<Jogo, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tabela_jogo.iD, tabela_jogo.tiTULO, tabela_jogo.ANO , tabela_jogo.imG_URL  AS imagem,
            tabela_jogo.dESCRICAO_CURTA, tabela_pertencente.pOSICAO
            FROM tabela_jogo
            INNER JOIN TABELA_PERTENCENTE ON tabeLA_JOGO.iD = tabela_perTENCENTE.JOGO_ID
            WHERE tabela_PERTENCENTE.lisTA_ID = :listaId
            ORDER BY tabela_pertencente.posicao
             """)
    List<JogoMiniProjeto> procurarPorLista(Long listaId);

}
