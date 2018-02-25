/**
 * 
 * @author Hemant Singh Bisht
 *
 */

public class PassValueNULLInOverloadedMethod {

	public static void setValue(Object value)
	{
		System.out.println("Object called");
	}
	
	public static void setValue(String value)
	{
		System.out.println("String called"); // This statement get executed because more specific one get
		                                     // priority always.
	}
	
	public static void main(String[] args) {

		PassValueNULLInOverloadedMethod.setValue(null);
	}
}
// Output : String called
