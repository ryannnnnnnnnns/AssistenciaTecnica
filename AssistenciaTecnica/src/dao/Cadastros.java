package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConexaoMySql;
import model.Cliente;
import model.Dispositivo;

public class Cadastros {

    public static boolean cadastrarServico(Cliente cliente, Dispositivo dispositivo) {

        String sql;
        sql = "INSERT INTO Servico (protocolo, cliente, dispositivo, defeito, valorServico) ";
        sql += "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cliente.getProtocolo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, dispositivo.getModelo());
            ps.setString(4, dispositivo.getDefeito());
            ps.setDouble(5, dispositivo.getValorServico());

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }
    }

    public static boolean cadastrarCliente(Cliente cliente){
        String sql;
        sql = "INSERT INTO Cliente (nome, cpf, telefone) ";
        sql += "VALUES (?, ?, ?)";        

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString (1, cliente.getNome()   );
            ps.setInt   (2, cliente.getCpf() );
            ps.setInt (3,cliente.getTelefone()   );
          

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }
    }

     public static boolean cadastrarDispositivo(Dispositivo dispositivo, Cliente cliente) {
        String sql;
        sql = "INSERT INTO Dispositivo (modelo, defeito, cliente, valorServico) ";
        sql += "VALUES (?, ?, ?, ?)";

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dispositivo.getModelo());
            ps.setString(2, dispositivo.getDefeito());
            ps.setString(3, cliente.getNome());
            ps.setDouble(4, dispositivo.getValorServico());
            

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }

    }
}

