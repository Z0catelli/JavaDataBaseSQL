/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String telefone;
    private String email;
    
    public void Inserir () throws SQLException{
        //Comando SQL
        String sql = "INSERT INTO Pessoa(nome, numero, email) VALUES(?,?,?)";
        // Abrir conexão
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection con = factory.conexao()){
            PreparedStatement ps = con.prepareStatement(sql);//pré compilação de informações
            
            ps.setString(1, getNome());
            ps.setString(2, getTelefone());
            ps.setString(3, getEmail());
            ps.execute();
        } catch (Exception ex){
            ex.printStackTrace();  
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
