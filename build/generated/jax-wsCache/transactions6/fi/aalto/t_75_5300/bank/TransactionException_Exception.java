
package fi.aalto.t_75_5300.bank;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TransactionException", targetNamespace = "http://aalto.fi/t-75.5300/bank")
public class TransactionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TransactionException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public TransactionException_Exception(String message, TransactionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public TransactionException_Exception(String message, TransactionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: fi.aalto.t_75_5300.bank.TransactionException
     */
    public TransactionException getFaultInfo() {
        return faultInfo;
    }

}
