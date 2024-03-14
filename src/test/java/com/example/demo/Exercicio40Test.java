package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio40Test {

    @Test
    public void valor_total_eh_igual_quantidade_adquirida_vezes_preco_unitario() {
        // Arrange
        int quantidadeAdquirida = 10;
        double valorUnitario = 5;
        double totalEsperado = quantidadeAdquirida * valorUnitario;
        var calculadora = new Calculadora();
        String descricaoDoProduto = "blusa";

        //Act
        var valorParaVenda = calculadora.calcular(quantidadeAdquirida, valorUnitario, descricaoDoProduto);

        // Assert
        Assertions.assertEquals(totalEsperado, valorParaVenda.getTotalSemDesconto());
    }

    @Test
    public void se_quantidade_adquirida_for_menor_igual_a_cinco_desconto_sera_dois_porcento() {
        double descontoEsperado = 0.02;
        var calculadora = new Calculadora();
        int quantidadeAdquirida = 5;
        double valorUnitario = 2;
        String descricaoDoProduto = "sapato";

        ValorParaVenda valorParaVenda = calculadora.calcular(quantidadeAdquirida, valorUnitario, descricaoDoProduto);

        Assertions.assertEquals(descontoEsperado, valorParaVenda.getDesconto());
    }

    @Test
    public void se_quantidade_maior_que_cinco_e_quantidade_menor_ou_iqual_dez_desconto_sera_tres_porcento() {
        double descontoEsperado = 0.03;
        var calculadora = new Calculadora();
        int quantidadeAdquirida = 10;
        double valorUnitario = 2;
        String descricaoDoProduto = "boné";

        ValorParaVenda valorParaVenda = calculadora.calcular(quantidadeAdquirida, valorUnitario, descricaoDoProduto);

        Assertions.assertEquals(descontoEsperado, valorParaVenda.getDesconto());
    }

    @Test
    public void se_quantidade_maior_dez_desconto_sera_5_porcento() {
        var descontoEsperado = 0.05;
        var calculadora = new Calculadora();
        int quantidadeAdquirida = 50;
        double valorUnitario = 2;
        String descricaoDoProduto = "relogio";

        ValorParaVenda valorParaVenda = calculadora.calcular(quantidadeAdquirida, valorUnitario, descricaoDoProduto);

        Assertions.assertEquals(descontoEsperado, valorParaVenda.getDesconto());
    }
}
