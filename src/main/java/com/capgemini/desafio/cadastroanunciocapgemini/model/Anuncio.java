package com.capgemini.desafio.cadastroanunciocapgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAnuncio;
    private String cliente;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Integer investimentoDia;

    @Deprecated
    public Anuncio() {
    }

    public Anuncio(Long id, String nomeAnuncio, String cliente, LocalDate dataInicio, LocalDate dataTermino, Integer investimentoDia) {
        this.id = id;
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.investimentoDia = investimentoDia;
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return "Anuncio{" +
                "id=" + id +
                ", nomeAnuncio='" + nomeAnuncio + '\'' +
                ", cliente='" + cliente + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataTermino=" + dataTermino +
                ", investimentoDia=" + investimentoDia +
                '}';
    }
}
