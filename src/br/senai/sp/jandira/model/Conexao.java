package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String server, user, password, banco;

    public Connection conexao;

    public Conexao(){
        this.server = "localhost";
        this.banco = "db_senai";
        this.user = "root";
        this.password = "bcd127";

    }

    public void connectDriver(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.server + "/" + this.banco, this.user, this.password);
        } catch (SQLException error){
            System.out.println(error);
        }

    }

    public Connection getConnection(){
        connectDriver();
        return conexao;
    }

}
