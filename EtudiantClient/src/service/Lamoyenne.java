
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour lamoyenne complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="lamoyenne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="somme" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lamoyenne", propOrder = {
    "somme"
})
public class Lamoyenne {

    protected double somme;

    /**
     * Obtient la valeur de la propri�t� somme.
     * 
     */
    public double getSomme() {
        return somme;
    }

    /**
     * D�finit la valeur de la propri�t� somme.
     * 
     */
    public void setSomme(double value) {
        this.somme = value;
    }

}
