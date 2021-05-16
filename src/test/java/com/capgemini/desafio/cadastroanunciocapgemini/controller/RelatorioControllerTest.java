package com.capgemini.desafio.cadastroanunciocapgemini.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RelatorioControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @Order(1)
    public void recuperarRelatorioPorId() throws Exception{
        URI uri = new URI("/relatorios/anuncios/1");
        String responseBody = "{" +
                "\"nomeAnuncio\": \"Heineken pure malt\"," +
                "\"cliente\": \"Hanz Heineken\"," +
                "\"dataInicio\":\"08/06/2021\"," +
                "\"dataTermino\":\"15/06/2021\"," +
                "\"investimentoDia\":10," +
                "\"valorTotalInvestido\":70," +
                "\"qtdMaximaVisualizacoes\":5180, " +
                "\"qtdMaximaClicks\":609," +
                "\"qtdMaximaCompartilhamentos\":77" +
                "}";

        System.out.println(responseBody);
        mockMvc.perform(MockMvcRequestBuilders.get(uri))
            .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()))
            .andExpect(MockMvcResultMatchers.content().json(responseBody));

    }

    @Test
    @Order(2)
    public void filtrarRelatoriosPorNomeEIntervaloDeTempo() throws Exception{
        URI uri = new URI("/relatorios?cliente=Hanz+Heineken&inicio=06/05/2021&fim=10/09/2021");
        String responseBody = "[\n" +
                "    {\n" +
                "        \"nomeAnuncio\": \"Heineken pure malt\",\n" +
                "        \"cliente\": \"Hanz Heineken\",\n" +
                "        \"dataInicio\": \"08/06/2021\",\n" +
                "        \"dataTermino\": \"15/06/2021\",\n" +
                "        \"investimentoDia\": 10,\n" +
                "        \"valorTotalInvestido\": 70,\n" +
                "        \"qtdMaximaVisualizacoes\": 5180,\n" +
                "        \"qtdMaximaClicks\": 609,\n" +
                "        \"qtdMaximaCompartilhamentos\": 77\n" +
                "    }\n" +
                "]";
        mockMvc.perform(MockMvcRequestBuilders.get(uri))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));

    }


}
