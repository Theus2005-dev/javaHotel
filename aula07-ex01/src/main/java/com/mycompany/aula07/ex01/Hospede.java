/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07.ex01;

/**
 *
 * @author User
 */
public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;
    
    public Hospede(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    };
    
    public String getNome(){
        return nome;
    };
    public String getCpf(){
        return cpf;
    };
    public String getTel(){
        return telefone;
    };
    
}
