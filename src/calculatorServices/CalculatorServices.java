package calculatorServices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "CalculatorServices", targetNamespace = "http://localhost:8080/WebServices/services")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class CalculatorServices {

	@WebMethod
	public float add(float val1, float val2) {
		return (val1 + val2);
	}
	
	@WebMethod
	public float subtract(float val1, float val2) {
		return (val1 - val2);
	}
	
	@WebMethod
	public float multiply(float val1, float val2) {
		return (val1 * val2);
	}
	
	@WebMethod
	public float divide(float val1, float val2) {
		if(val2 != 0) {
			return (val1 / val2);
		} else {
			return (0);
		}
	}
	
}