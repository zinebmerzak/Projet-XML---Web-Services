
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetOperations_QNAME = new QName("http://ws/", "getOperations");
    private final static QName _GetOperationsResponse_QNAME = new QName("http://ws/", "getOperationsResponse");
    private final static QName _ListOperations_QNAME = new QName("http://ws/", "listOperations");
    private final static QName _ListOperationsResponse_QNAME = new QName("http://ws/", "listOperationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOperations }
     * 
     * @return
     *     the new instance of {@link GetOperations }
     */
    public GetOperations createGetOperations() {
        return new GetOperations();
    }

    /**
     * Create an instance of {@link GetOperationsResponse }
     * 
     * @return
     *     the new instance of {@link GetOperationsResponse }
     */
    public GetOperationsResponse createGetOperationsResponse() {
        return new GetOperationsResponse();
    }

    /**
     * Create an instance of {@link ListOperations }
     * 
     * @return
     *     the new instance of {@link ListOperations }
     */
    public ListOperations createListOperations() {
        return new ListOperations();
    }

    /**
     * Create an instance of {@link ListOperationsResponse }
     * 
     * @return
     *     the new instance of {@link ListOperationsResponse }
     */
    public ListOperationsResponse createListOperationsResponse() {
        return new ListOperationsResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOperations }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOperations")
    public JAXBElement<GetOperations> createGetOperations(GetOperations value) {
        return new JAXBElement<>(_GetOperations_QNAME, GetOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOperationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOperationsResponse")
    public JAXBElement<GetOperationsResponse> createGetOperationsResponse(GetOperationsResponse value) {
        return new JAXBElement<>(_GetOperationsResponse_QNAME, GetOperationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOperations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOperations }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listOperations")
    public JAXBElement<ListOperations> createListOperations(ListOperations value) {
        return new JAXBElement<>(_ListOperations_QNAME, ListOperations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOperationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOperationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listOperationsResponse")
    public JAXBElement<ListOperationsResponse> createListOperationsResponse(ListOperationsResponse value) {
        return new JAXBElement<>(_ListOperationsResponse_QNAME, ListOperationsResponse.class, null, value);
    }

}
