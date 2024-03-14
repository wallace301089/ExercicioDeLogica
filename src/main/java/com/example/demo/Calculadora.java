package com.example.demo;

public class Calculadora {

    public ValorParaVenda calcular(int quantidadeAdquirida, double valorUnitario, String descricaoDoProduto) {
        if (quantidadeAdquirida <= 5) {
            return new ValorParaVenda(quantidadeAdquirida * valorUnitario, 0.02, descricaoDoProduto);
        }
        if (quantidadeAdquirida <= 10) {
            return new ValorParaVenda(quantidadeAdquirida * valorUnitario, 0.03, descricaoDoProduto);
        }
        return new ValorParaVenda(quantidadeAdquirida * valorUnitario, 0.05, descricaoDoProduto);
    }
}
