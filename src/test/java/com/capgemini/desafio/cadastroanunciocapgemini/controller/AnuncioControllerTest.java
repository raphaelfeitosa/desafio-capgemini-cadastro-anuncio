package com.capgemini.desafio.cadastroanunciocapgemini.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AnuncioControllerTest {


    @Autowired
    MockMvc mockMvc;

    @Test
    public void cadastrarAnuncioComSucessoRetorna201() throws Exception {

        URI uri = new URI("/anuncios");

        String requestBody = "{\"nomeAnuncio\": \"Heineken pure malt\"," +
                "\"cliente\": \"Hanz Heineken\"," +
                "\"dataInicio\":\"08/06/2021\"," +
                "\"dataTermino\":\"15/06/2021\"," +
                "\"investimentoDia\":10}";

        mockMvc.perform(
                MockMvcRequestBuilders.post(uri)
                        .content(requestBody)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.CREATED.value()))
                .andExpect(MockMvcResultMatchers.header().
                        string("Location", "http://localhost/anuncios/1"));

    }


}
