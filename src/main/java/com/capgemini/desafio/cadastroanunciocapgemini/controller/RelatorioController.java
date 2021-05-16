package com.capgemini.desafio.cadastroanunciocapgemini.controller;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import com.capgemini.desafio.cadastroanunciocapgemini.model.dto.RelatorioResponse;
import com.capgemini.desafio.cadastroanunciocapgemini.service.AnuncioService;
import com.capgemini.desafio.cadastroanunciocapgemini.service.GeradorDeRelatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    @Autowired
    private AnuncioService anuncioService;

    @Autowired
    private GeradorDeRelatorioService geradorDeRelatorioService;

    @GetMapping("/anuncios/{id}")
    public ResponseEntity<RelatorioResponse> findRelatorioByAnuncio(@PathVariable Long id) {

        Anuncio anuncio = anuncioService.findById(id);
        RelatorioResponse relatorio = geradorDeRelatorioService.gerarRelatorio(anuncio);

        return ResponseEntity.ok().body(relatorio);
    }

    @GetMapping()
    public ResponseEntity<List<RelatorioResponse>> buscaRelatoriosPorNomeEInvtervaloDeTempo(@RequestParam("cliente") String cliente,
                                                                            @RequestParam("inicio") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate inicio,
                                                                            @RequestParam("fim") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fim) {

        List<Anuncio> anuncios = anuncioService.buscaRelatoriosPorNomeEInvtervaloDeTempo(cliente, inicio, fim);
        List<RelatorioResponse> relatorios = anuncios.stream().map(a -> geradorDeRelatorioService.gerarRelatorio(a)).collect(Collectors.toList());

        return ResponseEntity.ok().body(relatorios);
    }


}
