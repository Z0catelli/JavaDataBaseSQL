/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.auladatabase;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws SQLException {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Insira o seu nome");
                    String telefone = JOptionPane.showInputDialog("Insira o seu telefone");
                    String email = JOptionPane.showInputDialog("Insira o seu email");
                    
                    Pessoa pessoa = new Pessoa();
                    pessoa.setNome(nome);
                    pessoa.setTelefone(telefone);
                    pessoa.setEmail(email);
                    pessoa.Inserir();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
            }
        } while (opcao!=0);
    }
}
