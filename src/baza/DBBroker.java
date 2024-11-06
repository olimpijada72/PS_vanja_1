/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.util.ArrayList;
import java.util.List;
import model.Knjiga;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;
import model.Zanr;

/**
 *
 * @author user
 */
public class DBBroker {

    public List<Knjiga> ucitajKnjigeIzBaze() {
        List<Knjiga> lista = new ArrayList<>();

//        String upit = "select *" +
//                    "from knjiga k" +
//                    "join autor a on a.id = k.autorID";
        String upit = "select * from knjiga k join autor a on a.id = k.autorID";
//        String upit = "select *" +
//                    "from knjiga";

        try {
            Statement statement = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {

                int id = rs.getInt("k.id");
                String naslov = rs.getString("k.naslov");
                int godinaIzdanja = rs.getInt("k.godinaIzdanja");
                String isbn = rs.getString("k.isbn");
                String zanr = rs.getString("k.zanr");
                Zanr z = Zanr.valueOf(zanr);

                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                String biografija = rs.getString("a.biografija");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                int autorID = rs.getInt("a.id");

                Autor autor = new Autor(autorID, ime, prezime, godinaRodjenja, biografija);

                Knjiga knjiga = new Knjiga(id, naslov, autor, isbn, godinaIzdanja, z);
                lista.add(knjiga);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public List<Autor> ucitajAutoreIzBaze() {
        List<Autor> lista = new ArrayList<>();

        String upit = "select * from autor a";

        try {
            Statement statement = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = statement.executeQuery(upit);
            while (rs.next()) {

                String ime = rs.getString("a.ime");
                String prezime = rs.getString("a.prezime");
                String biografija = rs.getString("a.biografija");
                int godinaRodjenja = rs.getInt("a.godinaRodjenja");
                int autorID = rs.getInt("a.id");

                Autor autor = new Autor(autorID, ime, prezime, godinaRodjenja, biografija);

                lista.add(autor);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public void obrisiKnjigu(int idKnjige) {
        String upit = "DELETE FROM knjiga where id = ?";
        
        try {
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, idKnjige);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
         

    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        String upit = "insert into knjiga "
                + " (id, naslov, autorID, isbn, godinaIzdanja, zanr)"
                + " values (?, ?, ?, ?, ?, ?)";
                 
        try {
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, novaKnjiga.getId());
            ps.setString(2, novaKnjiga.getNaslov());
            ps.setInt(3, novaKnjiga.getAutor().getId());
            ps.setString(4, novaKnjiga.getISBN());
            ps.setInt(5, novaKnjiga.getGodinaIzdanja());
            ps.setString(6, novaKnjiga.getZanr().toString());
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void azurirajKnjgu(Knjiga knjigaZaIzmenu) {
//        String upit = "update knjiga "
//                + " set  naslov = ?, autorID = ?, godinaIzdanja = ?, zanr = ? "
//                + " where id = ?";
      
        String upit = "Update knjiga set naslov = ?, autorID = ?, godinaIzdanja = ?, zanr = ? where id = ?";

        try {
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, knjigaZaIzmenu.getNaslov());
            ps.setInt(2, knjigaZaIzmenu.getAutor().getId());
            ps.setInt(3, knjigaZaIzmenu.getGodinaIzdanja());
            ps.setString(4, knjigaZaIzmenu.getZanr().toString());
            ps.setInt(5, knjigaZaIzmenu.getId());
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("Uspesno azurirano");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
