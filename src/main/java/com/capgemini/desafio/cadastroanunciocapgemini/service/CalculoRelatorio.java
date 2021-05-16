package com.capgemini.desafio.cadastroanunciocapgemini.service;

public class CalculoRelatorio {

//    /**
//     * Método main é a porta de entrada para executar o programa.
//     * Na execução deste método é impresso o total de cliques, total de compartilhamentos e
//     * total de visualizações por investimento/dia com base em valor em reais do tipo inteiro para simular o calculo.
//     * @param args
//     */
//    public static void main(String[] args) {
//
//        int visualizacaoPorDia = contarVisualizacaoPorInvestimentoDia(10);
//        int clicksDia = contarClicksPorInvestimentoDia(10);
//        int compartilhamentoDia = contarCompartilhamentoPorInvestimentoDia(10);
//
//        System.out.println("Total de Cliques/dia: " + clicksDia);
//        System.out.println("Total de compartilhamento/dia: " + compartilhamentoDia);
//        System.out.println("Total de visualizações por investimento/dia: " + visualizacaoPorDia);
//
//    }

    /**
     * Método recebe investimento/dia por parâmentro e calcula a quantidade total de compartilhamentos com base neste investimento.
     * @param investimentoDia
     * @return total de visualizações por investimento dia..
     */
    public static int contarVisualizacaoPorInvestimentoDia(Integer investimentoDia) {
        int totalDeViasualizacao = 0;
        int visualizacoesAtual = numeroDeVisualizaçõesAtual(investimentoDia);
        totalDeViasualizacao += visualizacoesAtual;
        for (int i = 1; i <= 5; i++) {

            int clicksAtual = numeroDeClickPorVisualizacao(visualizacoesAtual);

            int compartilhamentosAtual = numeroDeCompartilhamentoPorClick(clicksAtual);

            if (compartilhamentosAtual < 1 || i == 5) {
                break;
            }
            visualizacoesAtual = numeroDeVisualizacoesPorCompartilhamento(compartilhamentosAtual);
            totalDeViasualizacao += visualizacoesAtual;
        }
        return totalDeViasualizacao;
    }

    /**
     * Método recebe investimento/dia por parâmentro  e calcula a quantidade total de cliques com base neste investimento.
     * @param investimentoDia
     * @return total de cliques
     */
    public static int contarClicksPorInvestimentoDia(Integer investimentoDia) {
        int totalDeClicks = 0;

        int visualizacoesAtual = numeroDeVisualizaçõesAtual(investimentoDia);
        for (int i = 1; i <= 5; i++) {

            int clicksAtual = numeroDeClickPorVisualizacao(visualizacoesAtual);
            totalDeClicks += clicksAtual;
            int compartilhamentosAtual = numeroDeCompartilhamentoPorClick(clicksAtual);
            if (compartilhamentosAtual < 1 || i == 5) {
                break;
            }
            visualizacoesAtual = numeroDeVisualizacoesPorCompartilhamento(compartilhamentosAtual);

        }
        return totalDeClicks;
    }

    /**
     * Método recebe investimento por dia por parâmentro  e calcula a quantidade total de compartilhamentos com base neste investimento.
     * @param investimentoDia
     * @return total de compartilhamentos
     */
    public static int contarCompartilhamentoPorInvestimentoDia(Integer investimentoDia) {
        int totalDeCompatilhamento = 0;

        int visualizacoesAtual = numeroDeVisualizaçõesAtual(investimentoDia);
        for (int i = 1; i <= 4; i++) {

            int clicksAtual = numeroDeClickPorVisualizacao(visualizacoesAtual);
            int compartilhamentosAtual = numeroDeCompartilhamentoPorClick(clicksAtual);
            if (compartilhamentosAtual < 1) {
                break;
            }

            totalDeCompatilhamento += compartilhamentosAtual;
            visualizacoesAtual = numeroDeVisualizacoesPorCompartilhamento(compartilhamentosAtual);

        }
        return totalDeCompatilhamento;
    }

    /**
     * Método auxiliar que recebe a quantidade de compartilhamentos atual por parâmentro e calcula a quantidade de novas visualizações
     * @param compartilhamentosAtual
     * @return total de visualizações por compartilhamento
     */
    private static int numeroDeVisualizacoesPorCompartilhamento(int compartilhamentosAtual) {
        return compartilhamentosAtual * 40;
    }

    /**
     * Método recebe a quantidade de cliques atual e calcula a quantidade de compartilhamentos
     * @param clicksAtual
     * @return quantidade de compartilhamentos por cliques
     */
    private static int numeroDeCompartilhamentoPorClick(int clicksAtual) {
        return 3 * clicksAtual / 20;
    }

    /**
     * Método auxiliar que recebe a quantidade de visualizações atual do anuncio por parâmentro  e calcula a quantidade de cliques
     * @param visualizacaoAtual
     * @return quantidade de cliques com base na quantidade de visualizações atual do anuncio
     */
    private static int numeroDeClickPorVisualizacao(int visualizacaoAtual) {
        return 12 * visualizacaoAtual / 100;
    }

    /**
     * Método auxiliar que recebe inventimento por dia por parâmentro e calcula quantidade de visualizações atual do anuncio
     * @param investimentoDia
     * @return quantidade de visualizações atual do anuncio
     */
    private static int numeroDeVisualizaçõesAtual(Integer investimentoDia){
        return investimentoDia * 30;
    }
}