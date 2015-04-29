/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circle1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author shackox
 */

@WebService(serviceName = "WScircle")
public class WScircle {

    /**
     * This is a sample web service operation
     * @param r
     * @return 
     */
    @WebMethod(operationName = "area")
    public Double getArea(@WebParam(name = "r") Double r) {
        return Math.PI * (r * r);
    }
    
    @WebMethod(operationName = "circumference")
    public Double getCircumference(@WebParam(name = "r") Double r){
        return 2 * Math.PI * r;
    }
}
