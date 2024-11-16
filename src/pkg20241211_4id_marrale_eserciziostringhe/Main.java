/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241211_4id_marrale_eserciziostringhe;

/**
 *
 * Marrale Lorenzo
 * 
 * All'interno di questo programma esploreremo vari metodi applicabili alle stringhe
 * L'esercizio richiede di ottenere una stringa dall'utente e di contare quante volte appare la lettera "a"
 * Successivamente, stamperemo la lettera "A" in maiuscolo tante volte quante è stata trovata
 * Tutte le funzioni saranno definite esternamente al metodo main
 * 
 */
public class Main {

 
    public static void main(String[] args) {

        //crea un'istanza della classe request per gestire l'input
        Scanner_Utente scanner = new Scanner_Utente();
        //chiede all'utente di inserire una stringa tramite il metodo 'scan' dell'oggetto scanner
        scanner.scan();
        
        //crea un'istanza della classe Trova_Quantita_Lettere passando l'oggetto scanner come parametro
        //l'oggetto stampa_totale_a_minuscole di tipo Trova_Quantita_Lettere conterrà la stringa immessa dall'utente e il conteggio delle lettere 'a'
        Trova_Quantita_Lettere stampa_totale_a_minuscole = new Trova_Quantita_Lettere(scanner);
        //chiede all'oggetto 'stampa_totale_a_minuscole' di eseguire il conteggio delle lettere 'a' nella stringa
        stampa_totale_a_minuscole.ContatoreA();
        
        //crea un'istanza della classe Stampa_A_Maiuscola passando l'oggetto Trova_Quantita_Lettere
        Stampa_A_Maiuscola stampa_A = new Stampa_A_Maiuscola(stampa_totale_a_minuscole);
        //Chiede all'oggetto 'stampa_A' di stampare la lettera 'A' maiuscola per il numero di volte ottenute
        stampa_A.stampa_A_maiuscolo();
        
        
    }
    
}
