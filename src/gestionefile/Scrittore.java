package gestionefile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.io.FileReader;
/**
 *
 * @author MC
 * @version 12/01/23
 */

public class Scrittore implements Runnable{

    String nomeFile;
    
   
    
    public Scrittore(String nomeFile){
        this.nomeFile = nomeFile;
    }
    
    @Override
    public void run() {
        scrivi();
    }
    /**
     * Scrive un file di testo usando la classe BufferedWriter
     */
    public void scrivi(String[] args){
        BufferedWriter br=null;
        String output = "output.txt";
        String copia = "copia.txt";
        try {
            
            BufferedReader lettore =new BufferedReader(new FileReader(output));
            BufferedWriter scrittore=new BufferedWriter(new FileWriter(copia));
             String line;
            while ((line = lettore.readLine()) != null) {
                scrittore.write(line);
                scrittore.newLine(); }
            scrittore.close();
            lettore.close();
}catch (IOException e){
e.printStackTrace();}


try{
            //1) apro il file
            br = new BufferedWriter(
                    new FileWriter("user.json"));
            //2) scrivo nel buffer
            br.write("user.json");
            br.write("\n\r");
            //3) svuoto il buffer e salvo nel file i dati
            br.flush();         
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (br!=null)
                try {
                    //4)chiudo lo stream in uscita
                    br.close();
            } catch (IOException ex) {
                Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    }

    private void scrivi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

