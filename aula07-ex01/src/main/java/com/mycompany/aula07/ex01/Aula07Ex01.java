/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula07.ex01;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class Aula07Ex01 {

    public static void main(String[] args) {
      Hospede hospede = new Hospede("Matheus Arcangelli", "111.000.222-34", "(12) 333-444");
       Reserva reserva = new Reserva(
            1,
            LocalDate.of(2025, 5, 10),
            LocalDate.of(2025, 5, 15),
            hospede
       );
       System.out.println("Nome hospede: " + reserva.getHospede().getNome() +
                           "\nCpf hospede: " + reserva.getHospede().getCpf() +
                           "\nTelefone hospede: " + reserva.getHospede().getTel()+
                           "\nId reserva: " + reserva.getNumero() +
                           "\nData de entrada: " + reserva.getEntrada() +
                           "\nData saida: " + reserva.getSaida()              
                         );
       reserva.getValor();

    }
}
