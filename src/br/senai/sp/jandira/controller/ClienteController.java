package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteController {

    Conexao conexao = new Conexao();

    Connection objConnection = conexao.getConnection();

    public void listarCliente() throws SQLException {

        Statement statement = objConnection.createStatement();

        String queryConsulta = "SELECT * FROM cliente";

        ResultSet resultSet = statement.executeQuery(queryConsulta);

        Cliente cliente = new Cliente();

        while (resultSet.next()){
            cliente.setNome(resultSet.getString("nome"));
            cliente.setSobrenome(resultSet.getString("sobrenome"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setCpf(resultSet.getLong("cpf"));


            System.out.println(cliente.getNome());
        }
    }

}
