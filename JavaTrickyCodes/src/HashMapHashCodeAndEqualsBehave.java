import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Hemant Singh Bisht
 * Description : if equals() method always returns false and hashCode() method will always returns 100
 * what is the output of following program.
 */
class Employee
{
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode()
	{
		return 100;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
}

public class HashMapHashCodeAndEqualsBehave {

	public static void main(String[] args) {
		
		Map<Employee, String> empTypeMap = new HashMap<Employee, String>();
		
		Employee emp1 = new Employee(1, "Hemant");
		Employee emp2 = new Employee(2, "Bob");
		
		empTypeMap.put(emp1, "Full Time");
		empTypeMap.put(emp2, "Part Time");
		
		System.out.println(empTypeMap.get(emp1));
	}
}

//Output : Full Time
/**Reason : get() of HashMap also checks for == along with equals() with 'or' operator, 
            since == checks reference equality both are same so it will return 'Full time'**/