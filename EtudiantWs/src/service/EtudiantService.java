/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.Etudiant;

/**
 *
 * @author TCHECHE NJINANG ERIC ROMEO
 */
@WebService(name = "Etudiant")
public class EtudiantService {

    @WebMethod(operationName = "lamoyenne")
    public double calculMoyenne(@WebParam(name = "somme") double sm) {
        return sm/60;
    }

    @WebMethod(operationName = "unEtudiant")
    public Etudiant getEtudiantByMat(@WebParam(name = "matricule") Long matricule) {
        return new Etudiant(matricule, "John wick", "SIGL2");
    }

    @WebMethod(operationName = "listEtudiant")
    public List<Etudiant> getEtudiants(Long matricule) {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1801L, "John wick", "SIGL2"));
        etudiants.add(new Etudiant(1802L, "Steven Steagal", "SIGL2"));
        etudiants.add(new Etudiant(1803L, "Tamo dubuisson", "SIGL2"));
        etudiants.add(new Etudiant(1804L, "Henry lebois", "SIGL2"));
        etudiants.add(new Etudiant(1805L, "Parfait lafait", "SIGL2"));
        
        return etudiants;
    }
}
