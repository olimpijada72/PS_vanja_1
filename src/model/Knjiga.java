/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Knjiga {
    private int id;
    private String naslov;
    private Autor autor;
    private String ISBN;
    private int godinaIzdanja;
    private Zanr zanr;

    public Knjiga() {
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    
    public Knjiga(String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Knjiga(int id, String naslov, Autor autor, String ISBN, int godinaIzdanja, Zanr zanr) {
        this.id = id;
        this.naslov = naslov;
        this.autor = autor;
        this.ISBN = ISBN;
        this.godinaIzdanja = godinaIzdanja;
        this.zanr = zanr;
    }
    
    
    
     
    
            
            
            
            
        
            
            
            
            
    
    
    public Autor getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "naslov=" + naslov + ", autor=" + autor + ", ISBN=" + ISBN + ", godinaIzdanja=" + godinaIzdanja + ", zanr=" + zanr + '}';
    }

    
     
    
}
