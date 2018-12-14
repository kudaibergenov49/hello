package ru.kkudaibergen;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

@javax.jws.WebService
@Stateless
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Service {
    @WebMethod
    public String greeting(@WebParam(name = "name") String name) {
        return "Hello " + name;
    }
}
