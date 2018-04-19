/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet.Modele;

import Projet.Metier.Classe;
import Projet.Metier.Enseignant;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guillaume.Rigaux
 */
public class ClasseModeleTest {

    public ClasseModeleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterClasse method, of class ClasseModele.
     */
    @Test
    public void testAjouterClasse() {
        System.out.println("ajouterClasse");
        Classe c = new Classe("BE", 1, "Sciences");
        ClasseModele instance = new ClasseModele();
        String expResult = "Création de la classe effectuée";
        String result = instance.ajouterClasse(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of ajouterEnseignant method, of class ClasseModele.
     */
    @Test
    public void testAjouterEnseignant() {
        System.out.println("ajouterEnseignant");
        Enseignant e = new Enseignant("MAT1", "Rigaux", "GuillaumeEns");
        ClasseModele instance = new ClasseModele();
        String expResult = "Ajout de l'enseignant";
        String result = instance.ajouterEnseignant(e);
        assertEquals(expResult, result);

    }

    /**
     * Test of getClasse method, of class ClasseModele.
     */
    @Test
    public void testGetClasse() {
        System.out.println("getClasse");
        Classe c = new Classe("A123", 4, "Math spé");
        ClasseModele instance = new ClasseModele();
        instance.ajouterClasse(c);
        Classe expResult = c;
        Classe result = instance.getClasse(c);
        assertEquals(expResult, result);

    }

    /**
     * Test of getEnseignant method, of class ClasseModele.
     */
    @Test
    public void testGetEnseignant() {
        System.out.println("getEnseignant");
        Enseignant e = new Enseignant("Mat1234","Nom", "Prénom");
        ClasseModele instance = new ClasseModele();
        instance.ajouterEnseignant(e);
        Enseignant expResult = e;
        Enseignant result = instance.getEnseignant(e);
        assertEquals(expResult, result);

    }

    /**
     * Test of modifyC method, of class ClasseModele.
     */
    @Test
    public void testModifyC() {
        System.out.println("modifyC");
        Classe nvClasse = null;
        Classe tmpC = null;
        ClasseModele instance = new ClasseModele();
        String expResult = "Classe introuvable";
        String result = instance.modifyC(nvClasse, tmpC);
        assertEquals(expResult, result);

    }

    /**
     * Test of modifyE method, of class ClasseModele.
     */
    @Test
    public void testModifyE() {
        System.out.println("modifyE");
        Enseignant nvEns = new Enseignant("MATNEW","Rigaux","Patrick");
        Enseignant tmpE = new Enseignant("MAT1","Rigaux","Guillaume");
        ClasseModele instance = new ClasseModele();
        instance.ajouterEnseignant(tmpE);
        String expResult = "Modification effectuée";
        String result = instance.modifyE(nvEns, tmpE);
        assertEquals(expResult, result);

    }

    /**
     * Test of deleteE method, of class ClasseModele.
     */
    @Test
    public void testDeleteE() {
        System.out.println("deleteE");
        Enseignant e = new Enseignant("aaa", "RigauxEns", "GuillaumeEns");
        ClasseModele instance = new ClasseModele();
        instance.ajouterEnseignant(e);
        String result = instance.deleteE(e);
        String expResult = "Suppression effectuée";
        assertEquals(expResult, result);

    }

    /**
     * Test of deleteCl method, of class ClasseModele.
     */
    @Test
    public void testDeleteCl() {
        System.out.println("deleteCl");
        Classe c = new Classe("A0", 3, "Physique");
        ClasseModele instance = new ClasseModele();
        instance.ajouterClasse(c);
        String result = instance.deleteCl(c);
        String expResult = "Suppression effectuée";
        assertEquals(expResult, result);

    }

    /**
     * Test of tousEns method, of class ClasseModele.
     */
    @Test
    public void testTousEns() {
        System.out.println("tousEns");
        List<Enseignant> expResult = new ArrayList<>();
        ClasseModele instance = new ClasseModele();
        Enseignant e = new Enseignant("BEL", "Rigaux", "Guillaume");
        instance.ajouterEnseignant(e);
        expResult.add(e);
        Enseignant e2 = new Enseignant("ALL", "Crombez", "Rodrigue");
        instance.ajouterEnseignant(e2);
        expResult.add(e2);
        List<Enseignant> result = instance.tousEns();
        for (Enseignant eTrouve : expResult) {
            if (!result.contains(eTrouve)) {
                fail("Enseignant non présent dans la liste : " + eTrouve);
            }

        }

        for (Enseignant eTrouve : expResult) {
            instance.deleteE(eTrouve);
        }

    }

    /**
     * Test of toutesClasses method, of class ClasseModele.
     */
    @Test
    public void testToutesClasses() {
        System.out.println("toutesClasses");
        List<Classe> expResult = new ArrayList<>();
        ClasseModele instance = new ClasseModele();
        Classe c = new Classe("ABC", 5, "Economie");
        instance.ajouterClasse(c);
        expResult.add(c);
        Classe c2 = new Classe("DEF", 6, "Math");
        instance.ajouterClasse(c2);
        expResult.add(c2);
        List<Classe> result = instance.toutesClasses();
        for (Classe cTrouve : expResult) {
            if (!result.contains(cTrouve)) {
                fail("Classe non présente dans la liste : " + cTrouve);
            }

        }

        for (Classe cTrouve : expResult) {
            instance.deleteCl(cTrouve);
        }

    }

}