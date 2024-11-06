/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import baza.DBBroker;
import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author user
 */
public class Controller {
    private DBBroker dbb;
    private List<Knjiga> listaKnjiga = new ArrayList<>();
    private List<Autor> listaAutora = new ArrayList<>();

    
    private static Controller instance;
    
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        
        return instance;
    }
    
    
    private Controller() {
          dbb = new DBBroker();
          dbb.ucitajKnjigeIzBaze();
        
//        Autor autor1 = new Autor("Ivo", "Andric", 1892, "Biografjia ive andrica" );
//        Autor autor2 = new Autor("Danilo", "Kis", 1900, "Biografjia Kisa" );
//        Autor autor3 = new Autor("Mesa", "Selimovic", 2000, "Biografjia Mese" );
//        
//
//        Knjiga knjiga1 = new Knjiga("Na Drini Cuprija", autor1, "1234968", 1945, Zanr.ROMAN);
//        Knjiga knjiga2 = new Knjiga("Enciklopedija mrtvih", autor2, "1234968", 1975, Zanr.NAUCNA_FANTASTIKA);
//        Knjiga knjiga3 = new Knjiga("Tvrdjava", autor3, "1234968", 1995, Zanr.POEZIJA);
//
//        
//        listaKnjiga.add(knjiga1);
//        listaKnjiga.add(knjiga2);
//        listaKnjiga.add(knjiga3);
//        
//    
//        listaAutora.add(autor1);
//        listaAutora.add(autor2);
//        listaAutora.add(autor3); 
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }
    
    public void obrisiKnjigu(int selektovaniRed){
        dbb.obrisiKnjigu(selektovaniRed);
//        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        
        dbb.dodajKnjigu(novaKnjiga);
//        listaKnjiga.add(novaKnjiga);
//        System.out.println("KNJIGA JE DODATA");
        
    }

    public List<Knjiga> ucitajKnjigeIzBaze() {
        return dbb.ucitajKnjigeIzBaze();
        
    }

    public List<Autor> ucitajAutoreIzBaze() {
        return dbb.ucitajAutoreIzBaze();
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        dbb.azurirajKnjgu(knjigaZaIzmenu);

    }
    
}
