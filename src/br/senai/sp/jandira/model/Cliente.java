package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {

    Scanner scanner = new Scanner(System.in);

    String nome, sobrenome;
    long cpf, rg;

    public void cadastrarCliente(){

        System.out.println("Informe seu Nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o Sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe seu CPF: ");
        cpf = scanner.nextLong();



    }

}
