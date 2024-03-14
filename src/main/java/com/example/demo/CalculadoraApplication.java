package com.example.demo;

import java.util.Scanner;

public class CalculadoraApplication {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual descrição de produto");
        var descricaoDoProduto = scanner.next();

        System.out.println("De a Quantidade do produto");
        var quantindadeDoProduto = scanner.nextInt();

        System.out.println("De o valor Unitario");
        var valorUnitario = scanner.nextDouble();

        ValorParaVenda valorParaVenda = calculadora.calcular(quantindadeDoProduto, valorUnitario, descricaoDoProduto);

        System.out.println("Descriçao do produto " + valorParaVenda.getDescricaoDoProduto());
        System.out.println("total sem desconto " + valorParaVenda.getTotalSemDesconto());
        System.out.println("Valor do desconto " + valorParaVenda.getDesconto());
        System.out.println("Valor total com desconto " + valorParaVenda.getTotalComDesconto());
    }
}
