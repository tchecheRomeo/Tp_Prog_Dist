/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.List;

/**
 *
 * @author TCHECHE NJINANG ERIC ROMEO
 */
public class ClientEtudiant {
    
    public static void main(String[] args) {
        Etudiant stub = new EtudiantServiceService().getEtudiantPort();
        
        double moyenne =  stub.lamoyenne(600);
        System.out.println("Moyenne: " + moyenne);
        System.err.println("***************************");
        Etudiant_Type etudiant =  stub.unEtudiant(1500L);
        System.out.println("Etudiant: " + etudiant.getNom());
        System.err.println("***************************");
        List<Etudiant_Type> etudiants =  stub.listEtudiant(1500L);
        etudiants.forEach((etud) -> {
            System.out.println("Etudiant: " + etud.getNom());
            System.err.println("***************************");
        });
    }
    
}
