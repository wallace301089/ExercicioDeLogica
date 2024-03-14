package com.example.demo;

public class ValorParaVenda {
    private double totalSemDesconto;
    private double totalComDesconto;
    private double desconto;
    private String descricaoDoProduto;

    public ValorParaVenda(double totalSemDesconto, double desconto, String descricaoDoProduto) {
        this.totalSemDesconto = totalSemDesconto;
        this.desconto = desconto;
        calcularTotalComDesconto(totalSemDesconto, desconto);
        this.descricaoDoProduto = descricaoDoProduto;
    }

    private void calcularTotalComDesconto(double totalSemDesconto, double desconto) {
        this.totalComDesconto = totalSemDesconto - (totalSemDesconto * desconto);
    }

    public double getTotalSemDesconto() {
        return this.totalSemDesconto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getTotalComDesconto() {
        return totalComDesconto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }
}
