package com.capgemini.desafio.cadastroanunciocapgemini.service;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import com.capgemini.desafio.cadastroanunciocapgemini.repositories.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;


    public Anuncio save(Anuncio anuncio) {
        return anuncioRepository.save(anuncio);
    }


    public Anuncio findById(Long id) {
        return anuncioRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("Anuncio não encontrado");
        });
    }

    public List<Anuncio> buscaRelatoriosPorNomeEInvtervaloDeTempo(String cliente, LocalDate inicio, LocalDate fim) {
        return anuncioRepository.filtroAnuncio(cliente, inicio, fim);
    }
}
