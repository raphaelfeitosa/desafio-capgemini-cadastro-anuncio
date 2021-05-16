package com.capgemini.desafio.cadastroanunciocapgemini.controller;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import com.capgemini.desafio.cadastroanunciocapgemini.model.dto.NovoAnuncioRequest;
import com.capgemini.desafio.cadastroanunciocapgemini.service.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid NovoAnuncioRequest novoAnuncioRequest){

        Anuncio anuncio = anuncioService.save(novoAnuncioRequest.getModel());
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(anuncio.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

}
