/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241211_4id_marrale_eserciziostringhe;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * 
 * Questa classe acquisisce un input dall'utente, memorizzandolo nella variabile privata user_string
 * Il metodo scan() utilizza Scanner per leggere l'input e salvarlo
 * mentre il metodo getter get_user_string() consente ad altre classi di accedere alla stringa immessa
 * 
 */

public class Scanner_Utente {
    
    //crea variabile privata di tipo String di nome user_string 
    private String user_string;
    
    //crea il metodo get_string per restituire il valore di user_string ad altre classi
    public String get_user_string(){
    
    return user_string;
}
    
    
    public void scan(){

        //crea un oggetto Scanner per leggere l'input
        Scanner scan = new Scanner(System.in);
        //richiesta all'utente di inserire una parola in minuscolo
        System.out.println("Inserisci una parola in minuscolo: ");
        //imposta alla variabile user_string il valore immesso dall'utente
        user_string = scan.nextLine();
        
    }
}