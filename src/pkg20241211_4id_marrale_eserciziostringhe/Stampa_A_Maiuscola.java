/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241211_4id_marrale_eserciziostringhe;

/**
 *
 * Marrale Lorenzo
 * 
 *Questa classe si occupa di stampare la lettera 'A' maiuscola un numero di volte determinato dal conteggio delle lettere 'a' nella stringa fornita
 *Il costruttore riceve un oggetto di tipo Trova_Quantita_Lettere per ottenere il numero di occorrenze della lettera 'a'
 *Il metodo stampa_A_maiuscolo stampa la lettera 'A' per il numero di volte calcolato, visualizzandola una per ogni occorrenza
 * 
 */

public class Stampa_A_Maiuscola {
    
    //variabile privata per memorizzare il numero di occorenze
    private int ottieni_occorenze;
    
    //costruttore che riceve un oggetto di tipo Trova_Quantita_Lettere e ottiene il numero di occorrenze della lettera 'a'
    public Stampa_A_Maiuscola(Trova_Quantita_Lettere ottieni_occorenze) {
        
        //imposta la variabile ottieni_occorenze con il valore fornito dal metodo getContatoreA fornito nella classe Trova_Quantita_Lettere 
        this.ottieni_occorenze = ottieni_occorenze.getContatoreA();
        
    }
    
    //metodo per stampare la lettera 'A' maiuscola per il numero di volte ottenute
    public void stampa_A_maiuscolo(){
        
        System.out.println("la lettera 'A' in maiuscolo: ");
        
        //ciclo for utilizzato per stampare la lettera 'A' in maiuscolo tante volte quanto il numero di occorenze
        for(int i = 0; i<ottieni_occorenze; i++){
            
            //stampa 'A' maiscuola
            System.out.println("A");
            
        }
        
    }

  
    
    
    
    

        
        
    
}
