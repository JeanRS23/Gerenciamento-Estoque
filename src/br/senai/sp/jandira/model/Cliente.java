package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);

    String nome, sobrenome, email;
    long cpf;

    public void cadastrarCLiente(){

        System.out.println("Informe seu Nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o Sobrenome: ");
        this.sobrenome = scanner.nextLine();
        System.out.println("Informe seu Email: ");
        this.email = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        this.cpf = scanner.nextLong();
        scanner.nextLine();
    }









    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
