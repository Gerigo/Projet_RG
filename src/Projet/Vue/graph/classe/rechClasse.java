/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Vue.graph.classe;

import Projet.Modele.ClasseModele;
import java.awt.Color;
import java.util.ArrayList;
import Projet.Metier.Classe;
import java.util.List;

/**
 *
 * @author Guillaume.Rigaux
 */
public class rechClasse extends javax.swing.JPanel {

    private ClasseModele cm;

    public List<Classe> classes;

    public void setModele(ClasseModele cm) {

        this.cm = cm;
    }

    public rechClasse() {
        initComponents();
        this.setBackground(Color.ORANGE);
    }

    public void initPanel() {

        classes = new ArrayList<>(cm.toutesClasses());

        listClasse.removeAllItems();

        classes.forEach((c) -> {
            listClasse.addItem("Classe :  " + c.getSigle() + " de " + c.getAnnee() + "ème/ère année " + " et d'orientation " + c.getOrientation());
        });

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
        listClasse = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("Sélectionner la classe parmis la liste");
        add(jLabel1);

        listClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(listClasse);

        jButton1.setText("Modifier");
        add(jButton1);

        jButton2.setText("Supprimer");
        jButton2.setToolTipText("");
        add(jButton2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> listClasse;
    // End of variables declaration//GEN-END:variables
}
