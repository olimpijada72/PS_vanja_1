/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import controller.Controller;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Autor;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author user
 */
public class FormaKnjiga extends javax.swing.JDialog {

    private Controller controller;
    private GlavnaForma glavnaForma;
    private Knjiga knjigaZaIzmenu;

    /**
     * Creates new form FormaKnjiga
     */
    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigaZaIzmenu) {
        super(parent, modal);
        initComponents();
        controller = Controller.getInstance();
        popuniComboBoxAutorima();
        this.glavnaForma = (GlavnaForma) parent;

        if (knjigaZaIzmenu != null) {
            this.knjigaZaIzmenu = knjigaZaIzmenu;

            jTextFieldNaziv.setText(knjigaZaIzmenu.getNaslov());
            jTextFieldISBN.setText(knjigaZaIzmenu.getISBN());
            jTextFieldISBN.setEnabled(false);
            jTextFieldGodinaIzdanja.setText(String.valueOf(knjigaZaIzmenu.getGodinaIzdanja()));
            jComboBoxZanr.setSelectedItem(knjigaZaIzmenu.getAutor());
            jComboBoxZanr.setSelectedItem(knjigaZaIzmenu.getZanr());
            jButtonDodaj.setVisible(false);
        } else {
            jButtonIzmeni.setVisible(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldGodinaIzdanja = new javax.swing.JTextField();
        jComboBoxAutori = new javax.swing.JComboBox<>();
        jButtonDodaj = new javax.swing.JButton();
        jButtonOdustani = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jButtonIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv");

        jLabel2.setText("Autor");

        jLabel3.setText("ISBN");

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabel4.setText("Godina Izdanja");

        jTextFieldGodinaIzdanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGodinaIzdanjaActionPerformed(evt);
            }
        });

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jButtonOdustani.setText("Odustani");
        jButtonOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOdustaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Zanr");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));
        jComboBoxZanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxZanrActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jButtonDodaj)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIzmeni)
                    .addComponent(jButtonOdustani))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldISBN)
                    .addComponent(jTextFieldNaziv)
                    .addComponent(jComboBoxAutori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldGodinaIzdanja)
                    .addComponent(jComboBoxZanr, 0, 146, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldGodinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDodaj)
                    .addComponent(jButtonIzmeni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonOdustani)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldGodinaIzdanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGodinaIzdanjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGodinaIzdanjaActionPerformed

    private void jButtonOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOdustaniActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonOdustaniActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        int godinaIzdanja;
        String naziv = jTextFieldNaziv.getText();
        String isbn = jTextFieldNaziv.getText();
        try {

            godinaIzdanja = Integer.parseInt(jTextFieldGodinaIzdanja.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora da bude broj");
            return;
        }

        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        Autor autor = (Autor) jComboBoxAutori.getSelectedItem();

        Knjiga novaKnjiga = new Knjiga(naziv, autor, isbn, godinaIzdanja, zanr);

        controller.dodajKnjigu(novaKnjiga);
        glavnaForma.osveziTabelu();
        this.dispose();


    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jComboBoxZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxZanrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxZanrActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        int godinaIzdanja;
        String naziv = jTextFieldNaziv.getText();

        try {

            godinaIzdanja = Integer.parseInt(jTextFieldGodinaIzdanja.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora da bude broj");
            return;
        }

        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        Autor autor = (Autor) jComboBoxAutori.getSelectedItem();

        controller.azurirajKnjigu(knjigaZaIzmenu);
//        knjigaZaIzmenu.setAutor(autor);
//        knjigaZaIzmenu.setNaslov(naziv);
//        knjigaZaIzmenu.setGodinaIzdanja(godinaIzdanja);
//        knjigaZaIzmenu.setZanr(zanr);
        glavnaForma.osveziTabelu();
        JOptionPane.showMessageDialog(this, "Knjiga uspesno izmenjena", "Usepsno", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormaKnjiga dialog = new FormaKnjiga(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonOdustani;
    private javax.swing.JComboBox<Autor> jComboBoxAutori;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGodinaIzdanja;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
        jComboBoxAutori.removeAllItems();
        List<Autor> autori = Controller.getInstance().ucitajAutoreIzBaze();
        for (Autor autor : autori) {
            jComboBoxAutori.addItem(autor);
        }

    }
}
