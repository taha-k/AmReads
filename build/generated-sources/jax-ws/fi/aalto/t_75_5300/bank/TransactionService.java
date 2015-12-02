
package fi.aalto.t_75_5300.bank;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransactionService", targetNamespace = "http://aalto.fi/t-75.5300/bank", wsdlLocation = "file:/home/taha/Downloads/transactions6.wsdl")
public class TransactionService
    extends Service
{

    private final static URL TRANSACTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSACTIONSERVICE_EXCEPTION;
    private final static QName TRANSACTIONSERVICE_QNAME = new QName("http://aalto.fi/t-75.5300/bank", "TransactionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/taha/Downloads/transactions6.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACTIONSERVICE_WSDL_LOCATION = url;
        TRANSACTIONSERVICE_EXCEPTION = e;
    }

    public TransactionService() {
        super(__getWsdlLocation(), TRANSACTIONSERVICE_QNAME);
    }

    public TransactionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACTIONSERVICE_QNAME, features);
    }

    public TransactionService(URL wsdlLocation) {
        super(wsdlLocation, TRANSACTIONSERVICE_QNAME);
    }

    public TransactionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACTIONSERVICE_QNAME, features);
    }

    public TransactionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransactionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Transactions
     */
    @WebEndpoint(name = "TransactionsPort")
    public Transactions getTransactionsPort() {
        return super.getPort(new QName("http://aalto.fi/t-75.5300/bank", "TransactionsPort"), Transactions.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Transactions
     */
    @WebEndpoint(name = "TransactionsPort")
    public Transactions getTransactionsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://aalto.fi/t-75.5300/bank", "TransactionsPort"), Transactions.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACTIONSERVICE_EXCEPTION!= null) {
            throw TRANSACTIONSERVICE_EXCEPTION;
        }
        return TRANSACTIONSERVICE_WSDL_LOCATION;
    }

}