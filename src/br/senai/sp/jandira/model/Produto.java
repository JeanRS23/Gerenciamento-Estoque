package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Produto {

    Scanner scanner = new Scanner(System.in);

    String nome, fornecedor;
    int codigo, quantidade;
    double preco;

    public void cadastrarProduto(){

        System.out.println("Informe o nome do Produto: ");
        nome = scanner.nextLine();
        System.out.println("Informe o Fornecedor do Produto:");
        fornecedor = scanner.nextLine();
        System.out.println("Informe o Código do Produto: ");
        codigo = scanner.nextInt();
        System.out.println("Informe o Preço:");
        preco = scanner.nextDouble();
        System.out.println("Informe a Quantidade: ");
        quantidade = scanner.nextInt();
        scanner.nextLine();

    }

}
