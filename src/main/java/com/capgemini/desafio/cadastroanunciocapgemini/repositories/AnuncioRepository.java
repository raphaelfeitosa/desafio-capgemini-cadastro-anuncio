package com.capgemini.desafio.cadastroanunciocapgemini.repositories;

import com.capgemini.desafio.cadastroanunciocapgemini.model.Anuncio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {


    @Query(value = "select a from Anuncio as a where a.cliente =:cliente AND " +
            "a.dataInicio BETWEEN :inicio AND :fim")
    List<Anuncio> filtroAnuncio(String cliente, LocalDate inicio, LocalDate fim);

}
