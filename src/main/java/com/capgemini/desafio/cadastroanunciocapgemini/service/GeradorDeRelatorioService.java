package com.capgemini.desafio.cadastroanunciocapgemini.service;

import com.capgemini.desafio.cadastroanunciocapgemini.model.dto.RelatorioResponse;
import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

@Service
public class GeradorDeRelatorioService {

    public RelatorioResponse gerarRelatorio(Anuncio anuncio) {
        int dias = (int) ChronoUnit.DAYS.between(anuncio.getDataInicio(), anuncio.getDataTermino());

        int totalInvestido = anuncio.getInvestimentoDia() * dias;

        int totalDeViasualizacao = CalculoRelatorio.contarVisualizacaoPorInvestimentoDia(anuncio.getInvestimentoDia()) * dias;
        int totalDeClicks = CalculoRelatorio.contarClicksPorInvestimentoDia(anuncio.getInvestimentoDia()) * dias;
        int totalDeCompatilhamento = CalculoRelatorio.contarCompartilhamentoPorInvestimentoDia(anuncio.getInvestimentoDia()) * dias;

        return new RelatorioResponse(anuncio.getNomeAnuncio(), anuncio.getCliente(), anuncio.getDataInicio(),
                anuncio.getDataTermino(), anuncio.getInvestimentoDia(), totalInvestido, totalDeViasualizacao, totalDeClicks, totalDeCompatilhamento);
    }

}
