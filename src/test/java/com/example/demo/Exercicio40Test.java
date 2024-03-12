package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio40Test {

    @Test
    public void deve_calcular_valor_para_venda() {
        double totalEsperado = 50;

        var calculadora = new Calculadora();
        var total = calculadora.calcular();

        Assertions.assertEquals(totalEsperado, total);
    }
}
