/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.auladatabase;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author gabri
 */
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "senha utilizada no usuario do MySQL Workbench";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "Pessoa";
    
    public Connection conexao(){
        try { //"tentar" conexao
            Connection con = DriverManager.getConnection("jdbc:mysql://"+ host+":"+porta+"/"+bd+"?useTimezone=true&serverTimezone=UTC",usuario,senha);

            return con;
        }catch (Exception ex){ //em caso de exceção
            ex.printStackTrace();
            return null;
        }
    }
    
}
