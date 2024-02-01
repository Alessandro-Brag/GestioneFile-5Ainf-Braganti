package gestionefile;
import java.util.Scanner;
/**
 *
 * @author MC
 * @version 12/01/23
 */
public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        lettore.start();
        //2)ELABORAZIONE
        Scanner scanner=new Scanner (System.in);
        System.out.print("username: ");
        String username = scanner.nextLine();
        System.out.print("password: ");
        String password = scanner.nextLine();
        scanner.close();
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.txt");
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
      
        
        
    }
    
}
