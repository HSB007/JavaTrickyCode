/**
 * 
 * @author Hemant Singh Bisht
 *
 */

public class FinalMemberJVMTrick {

	public static void main(String[] args) {
		System.out.println(Demo.a); // replace with constant 10 because a is final in class Demo.
		                            // If you make a as non final then it should execute the static block also.
	}
}

class Demo // This class will not load in the memory.
{ 
	static final int a=10;
	
	static // Thorugh Demo class is not loaded in the memory so it should execute the code.
	{
		System.out.println("100");
	}
}

// Output : 10
// Reason : Demo class will never load in the memory.
