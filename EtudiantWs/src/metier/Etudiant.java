/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TCHECHE NJINANG ERIC ROMEO
 */

@XmlRootElement
public class Etudiant implements Serializable{
    private Long matricule;
    private String nom;
    private String classe;

    public Etudiant() {
        super();
    }

    public Etudiant(Long matricule, String nom, String classe) {
        this.matricule = matricule;
        this.nom = nom;
        this.classe = classe;
    }

    public Long getMatricule() {
        return matricule;
    }

    public void setMatricule(Long matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    
    
}
