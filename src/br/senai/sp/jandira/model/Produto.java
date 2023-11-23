package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

    private String nome, fornecedor;
    private int codigo, quantidade;
    double preco;

    public void cadastrarProduto(){

        System.out.println("Informe o nome do Produto: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o Fornecedor do Produto:");
        this.fornecedor = scanner.nextLine();
        System.out.println("Informe o Código do Produto: ");
        this.codigo = scanner.nextInt();
        System.out.println("Informe o Preço:");
        this.preco = scanner.nextDouble();
        System.out.println("Informe a Quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine();

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
