/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241211_4id_marrale_eserciziostringhe;

/**
 *
 * Marrale Lorenzo
 * 
 * Questa classe conta le occorrenze della lettera 'a' nella stringa fornita dall'utente
 * Utilizza un ciclo per esaminare ogni carattere della stringa e incrementa un contatore ogni volta che trova una 'a'
 * Alla fine, stampa il numero totale di 'a' trovate
 * 
 */

public class Trova_Quantita_Lettere {
       
    //variabile privata per memorizzare la stringa di input 
    private String input_string;
    //variabile privata per il contatore delle lettere 'a'
    private int contatore_a;

    //costruttore che riceve un oggetto di tipo Scanner_Utente e inizializza la stringa input_string
    public Trova_Quantita_Lettere(Scanner_Utente input_string) {
        
        //imposta la variabile input_string con il valore della stringa immessa precedentemente dall'utente
        this.input_string = input_string.get_user_string();
        
    }
    
    //metodo per contare il numero di occorenze della lettera 'a' nella stringa 
    public void ContatoreA(){
    
    //inizialzazzione del contatore a 0
    contatore_a = 0;
    
    //ciclo for che controlla ogni carattere presente nella stringa
    for(int i = 0; i < input_string.length(); i++){
    
     //condizione utilizzata per controllare ogni carattere della stringa e verificare se in essa è presente la lettera 'a'
     if (input_string.charAt(i) == 'a'){
         
         //se viene soddisfatta la condizione incrementa di 1 il contatore
         contatore_a++;
         
         }
        }
    
    //stampa numero totale di 'a' trovate nella stringa
    System.out.println("la lettera 'a' in minuscolo e' presente " + contatore_a + " volte");
    
    }

    //crea il metodo getContatoreA per restituire il valore di contatore_a ad altre classi
     public int getContatoreA() {
         
        return contatore_a;
        
    }
     
}
