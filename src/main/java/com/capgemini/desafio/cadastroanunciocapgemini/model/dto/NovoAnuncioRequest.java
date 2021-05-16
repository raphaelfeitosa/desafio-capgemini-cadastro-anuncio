package com.capgemini.desafio.cadastroanunciocapgemini.model.dto;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class NovoAnuncioRequest {

    private String nomeAnuncio;
    private String cliente;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dataInicio;

    @JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate dataTermino;

    private Integer investimentoDia;

    public NovoAnuncioRequest() {
    }

    public NovoAnuncioRequest(String nomeAnuncio, String cliente, LocalDate dataInicio, LocalDate dataTermino, Integer investimentoDia) {
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.investimentoDia = investimentoDia;
    }

    /**
     * Método get
     * @return uma string do tipo
     */
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

    public Anuncio getModel() {
        return new Anuncio(null,this.nomeAnuncio,this.cliente,this.dataInicio,this.dataTermino,this.investimentoDia);
    }
}
