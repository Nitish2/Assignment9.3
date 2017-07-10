package AbstractClass;

abstract class Employee { // Creating class employee

	int empId; // Integer viable
	String empName; // String variable
	int total_leaves; // Integer Variable
	double total_salary; // Double variable

	Employee(int id, String name, int total, double sal) { // Creating Constructor
															
		empId = id;
		empName = name;
		total_leaves = total;
		total_salary = sal;
	}

	void calculate_balance_leaves() { // Creating abstract method
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return true;
	}

	void calculate_salary() {

	}

}
