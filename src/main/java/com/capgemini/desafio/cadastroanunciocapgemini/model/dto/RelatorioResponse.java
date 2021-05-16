package com.capgemini.desafio.cadastroanunciocapgemini.model.dto;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class RelatorioResponse {

    private String nomeAnuncio;
    private String cliente;
    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dataInicio;
    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dataTermino;
    private Integer investimentoDia;
    private Integer valorTotalInvestido;
    private Integer qtdMaximaVisualizacoes;
    private Integer qtdMaximaClicks;
    private Integer qtdMaximaCompartilhamentos;

    public RelatorioResponse() {
    }

    public RelatorioResponse(String nomeAnuncio, String cliente, LocalDate dataInicio, LocalDate dataTermino, Integer investimentoDia, Integer valorTotalInvestido, Integer qtdMaximaVisualizacoes, Integer qtdMaximaClicks, Integer qtdMaximaCompartilhamentos) {
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.investimentoDia = investimentoDia;
        this.valorTotalInvestido = valorTotalInvestido;
        this.qtdMaximaVisualizacoes = qtdMaximaVisualizacoes;
        this.qtdMaximaClicks = qtdMaximaClicks;
        this.qtdMaximaCompartilhamentos = qtdMaximaCompartilhamentos;
    }

    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public Integer getInvestimentoDia() {
        return investimentoDia;
    }

    public Integer getValorTotalInvestido() {
        return valorTotalInvestido;
    }

    public Integer getQtdMaximaVisualizacoes() {
        return qtdMaximaVisualizacoes;
    }

    public Integer getQtdMaximaClicks() {
        return qtdMaximaClicks;
    }

    public Integer getQtdMaximaCompartilhamentos() {
        return qtdMaximaCompartilhamentos;
    }
}
