
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour unEtudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="unEtudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricule" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unEtudiant", propOrder = {
    "matricule"
})
public class UnEtudiant {

    protected Long matricule;

    /**
     * Obtient la valeur de la propriété matricule.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatricule() {
        return matricule;
    }

    /**
     * Définit la valeur de la propriété matricule.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatricule(Long value) {
        this.matricule = value;
    }

}
