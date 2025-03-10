/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03.pkg10_fuvar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author patri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Fajl = "fuvar.csv";
        
        List<String[]> adatok = new ArrayList<>();
        
        //Beolvasás
        //try with resources szerkezet
        
        
        ListaFeltolt(adatok,Fajl);
        
        //Függvény hívás
        
        //int c = Szorzat(3,4);
        //System.out.println(c);
        
        System.out.println("A sorok száma" + adatok.size());
        
        
        Kiir(adatok);
    }
    
    //eljárás - void
    //Láthatóság  visszatérés név (paraméterek) {metódusmag...}
    
    static void ListaFeltolt(List<String[]> lista, String fajlnev){
    
               try(BufferedReader reader = new BufferedReader
        (new FileReader(fajlnev))){
            String sor;
            reader.readLine();
            while((sor = reader.readLine()) != null){
                
                String[] darabolt_adat = sor.trim().split(";");
                
                lista.add(darabolt_adat);
            }
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
    
    }
    
    //Függvény
    
    public static int Szorzat(int a, int b){
        int eredmeny = a * b;
        return eredmeny;
    }
    
    
    //kiírás
    
    public static void Kiir(List<String[]> lista){
        for(String[] adat : lista){
            System.out.println(Arrays.toString(adat));
        }
    }
}
