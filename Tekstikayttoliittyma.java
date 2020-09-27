
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {
        while(true){
            System.out.print("Komento: ");
            String komento = this.lukija.nextLine();
            if(komento.equals("lopeta")){
                System.out.println("Hei hei!");
                break;
            }else if(komento.equals("hae")){
                System.out.print("Haettava: ");
                String haettava = this.lukija.nextLine();
                System.out.print("Käännös: ");
                System.out.println(this.sanakirja.kaanna(haettava));
            }else if(komento.equals("lisaa")){
                System.out.print("Sana: ");
                String sana = this.lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = this.lukija.nextLine();
                this.sanakirja.lisaa(sana, kaannos);
            }else {
                System.out.println("Tuntematon komento");
            }
        }
    }
    
    
}
