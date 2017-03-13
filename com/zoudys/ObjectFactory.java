
package com.zoudys;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zoudys package. 
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

    private final static QName _TestResponse_QNAME = new QName("http://zoudys.com/", "testResponse");
    private final static QName _ConversionEuroFcfa_QNAME = new QName("http://zoudys.com/", "conversionEuroFcfa");
    private final static QName _ConversionEuroFcfaResponse_QNAME = new QName("http://zoudys.com/", "conversionEuroFcfaResponse");
    private final static QName _Test_QNAME = new QName("http://zoudys.com/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zoudys
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link ConversionEuroFcfaResponse }
     * 
     */
    public ConversionEuroFcfaResponse createConversionEuroFcfaResponse() {
        return new ConversionEuroFcfaResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroFcfa }
     * 
     */
    public ConversionEuroFcfa createConversionEuroFcfa() {
        return new ConversionEuroFcfa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zoudys.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroFcfa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zoudys.com/", name = "conversionEuroFcfa")
    public JAXBElement<ConversionEuroFcfa> createConversionEuroFcfa(ConversionEuroFcfa value) {
        return new JAXBElement<ConversionEuroFcfa>(_ConversionEuroFcfa_QNAME, ConversionEuroFcfa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroFcfaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zoudys.com/", name = "conversionEuroFcfaResponse")
    public JAXBElement<ConversionEuroFcfaResponse> createConversionEuroFcfaResponse(ConversionEuroFcfaResponse value) {
        return new JAXBElement<ConversionEuroFcfaResponse>(_ConversionEuroFcfaResponse_QNAME, ConversionEuroFcfaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://zoudys.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

}
