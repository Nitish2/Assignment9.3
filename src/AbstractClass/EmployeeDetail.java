package AbstractClass;

public class EmployeeDetail {

	public static void main(String[] args) {

		Employee obj1 = new PermanentEmp(1121, "Nitish negi", 15, 40000); // Creating object

																			
		System.out.println("Parmanent employee details");

		System.out.println("Id  =" + obj1.empId); // Calling permanent employee variables
		System.out.println("name =" + obj1.empName);
		System.out.println("leave =" + obj1.total_leaves);

		obj1.calculate_balance_leaves(); // Calling Method
		obj1.avail_leave(21, (char) 0);
		obj1.calculate_salary();
		System.out.println("\n");

		Employee obj2 = new TemporaryEmp(1145, "Zakir Khan", 22, 35000);
		System.out.println("temporay employee detail");
	
		System.out.println("Id  =" + obj2.empId); // Calling temporary employee variables 
		System.out.println("name =" + obj2.empName);
		System.out.println("leave =" + obj2.total_leaves);
	
		obj1.calculate_balance_leaves(); // Calling method 
		obj1.avail_leave(20, (char) 0);
		obj1.calculate_salary();

	}
}
