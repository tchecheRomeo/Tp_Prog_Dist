
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListEtudiant_QNAME = new QName("http://service/", "listEtudiant");
    private final static QName _ListEtudiantResponse_QNAME = new QName("http://service/", "listEtudiantResponse");
    private final static QName _UnEtudiant_QNAME = new QName("http://service/", "unEtudiant");
    private final static QName _UnEtudiantResponse_QNAME = new QName("http://service/", "unEtudiantResponse");
    private final static QName _Etudiant_QNAME = new QName("http://service/", "etudiant");
    private final static QName _LamoyenneResponse_QNAME = new QName("http://service/", "lamoyenneResponse");
    private final static QName _Lamoyenne_QNAME = new QName("http://service/", "lamoyenne");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnEtudiant }
     * 
     */
    public UnEtudiant createUnEtudiant() {
        return new UnEtudiant();
    }

    /**
     * Create an instance of {@link ListEtudiantResponse }
     * 
     */
    public ListEtudiantResponse createListEtudiantResponse() {
        return new ListEtudiantResponse();
    }

    /**
     * Create an instance of {@link ListEtudiant }
     * 
     */
    public ListEtudiant createListEtudiant() {
        return new ListEtudiant();
    }

    /**
     * Create an instance of {@link Lamoyenne }
     * 
     */
    public Lamoyenne createLamoyenne() {
        return new Lamoyenne();
    }

    /**
     * Create an instance of {@link LamoyenneResponse }
     * 
     */
    public LamoyenneResponse createLamoyenneResponse() {
        return new LamoyenneResponse();
    }

    /**
     * Create an instance of {@link Etudiant_Type }
     * 
     */
    public Etudiant_Type createEtudiant_Type() {
        return new Etudiant_Type();
    }

    /**
     * Create an instance of {@link UnEtudiantResponse }
     * 
     */
    public UnEtudiantResponse createUnEtudiantResponse() {
        return new UnEtudiantResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listEtudiant")
    public JAXBElement<ListEtudiant> createListEtudiant(ListEtudiant value) {
        return new JAXBElement<ListEtudiant>(_ListEtudiant_QNAME, ListEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "listEtudiantResponse")
    public JAXBElement<ListEtudiantResponse> createListEtudiantResponse(ListEtudiantResponse value) {
        return new JAXBElement<ListEtudiantResponse>(_ListEtudiantResponse_QNAME, ListEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "unEtudiant")
    public JAXBElement<UnEtudiant> createUnEtudiant(UnEtudiant value) {
        return new JAXBElement<UnEtudiant>(_UnEtudiant_QNAME, UnEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "unEtudiantResponse")
    public JAXBElement<UnEtudiantResponse> createUnEtudiantResponse(UnEtudiantResponse value) {
        return new JAXBElement<UnEtudiantResponse>(_UnEtudiantResponse_QNAME, UnEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Etudiant_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "etudiant")
    public JAXBElement<Etudiant_Type> createEtudiant(Etudiant_Type value) {
        return new JAXBElement<Etudiant_Type>(_Etudiant_QNAME, Etudiant_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LamoyenneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "lamoyenneResponse")
    public JAXBElement<LamoyenneResponse> createLamoyenneResponse(LamoyenneResponse value) {
        return new JAXBElement<LamoyenneResponse>(_LamoyenneResponse_QNAME, LamoyenneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lamoyenne }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "lamoyenne")
    public JAXBElement<Lamoyenne> createLamoyenne(Lamoyenne value) {
        return new JAXBElement<Lamoyenne>(_Lamoyenne_QNAME, Lamoyenne.class, null, value);
    }

}
