/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07.ex01;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author User
 */
public class Reserva {
    private int numero;
    private LocalDate entrada;
    private LocalDate saida;
    private Hospede hospede;
   ;
    
    public Reserva(int numero, LocalDate entrada, LocalDate saida, Hospede hospede){
       this.numero = numero;
       this.entrada = entrada;
       this.saida = saida;
       this.hospede = hospede;
       
    };
    
    public int getNumero(){
        return numero;
    };
    public LocalDate getEntrada(){
        return entrada;
    };
    public LocalDate getSaida(){
        return saida;
    };
    public Hospede getHospede(){
        return hospede;
    };
    
    public void getValor(){
       long dias = ChronoUnit.DAYS.between(entrada, saida);
       System.out.println("Valor: " + dias * 120);
    };

   
    
   
    
}
