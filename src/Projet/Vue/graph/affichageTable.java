/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Vue.graph;

import Projet.Metier.Attribution;
import Projet.Metier.Classe;
import Projet.Metier.Enseignant;
import Projet.Modele.ClasseModele;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guillaume.Rigaux
 */
public class affichageTable extends javax.swing.JPanel {
    
    public List<Enseignant> enseignants;
    public List<Classe> classes;
    public List<Attribution> attributions;

    /**
     * Creates new form affichage
     */
    private ClasseModele cm;
    
    public void setModele(ClasseModele cm) {
        
        this.cm = cm;
    }

    /**
     * Creates new form affichageTable
     */
    public affichageTable() {
        initComponents();
        addRowToJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listEns = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listClasse = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        listAtt = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 2));

        listEns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Matricule", "Nom", "Prenom", "Ad mail", "Titulaire", "Remplacant"
            }
        ));
        jScrollPane1.setViewportView(listEns);

        add(jScrollPane1);

        listClasse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sigle", "Année", "Orientation"
            }
        ));
        jScrollPane2.setViewportView(listClasse);

        add(jScrollPane2);

        listAtt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sigle", "Matricule"
            }
        ));
        jScrollPane3.setViewportView(listAtt);

        add(jScrollPane3);

        jButton1.setText("jButton1");
        add(jButton1);
    }// </editor-fold>//GEN-END:initComponents

    public void initPanel() {
       listEns(); 
       
    }
    
    public ArrayList listEns(){
        ArrayList<Enseignant> ens = new ArrayList<Enseignant>(cm.tousLesEns);
         enseignants.forEach((Enseignant e) -> {
            ens.add(e);    
        });

         
        return ens; 
    }
    
    public void addRowToJtable(){
        
        DefaultTableModel model = (DefaultTableModel) listEns.getModel();
        ArrayList<Enseignant> ens = listEns(); 
        Object rowData[] = new Object[6];
        for(int i = 0; i < ens.size(); i++){
            rowData[0] = ens.get(i).getMatricule();
            rowData[1] = ens.get(i).getNom();
            rowData[2] = ens.get(i).getPrenom();
            rowData[3] = ens.get(i).getMail();
            rowData[4] = ens.get(i).getTitulaire();
            rowData[5] = ens.get(i).getRemplacant();
            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listAtt;
    private javax.swing.JTable listClasse;
    private javax.swing.JTable listEns;
    // End of variables declaration//GEN-END:variables
}
