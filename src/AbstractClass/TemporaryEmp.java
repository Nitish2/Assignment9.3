package AbstractClass;

class TemporaryEmp extends Employee {
	TemporaryEmp(int id, String name, int total, double sal) {

		super(id, name, total, sal); // Super

	}

	int paid_leave = 5, sick_leave = 3, casual_leave = 2; // Assigning values to the variables.

											

	void print_leave_details() { // Declaring Method

		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}

	void calculate_balance_leaves() {
		int total = total_leaves - (paid_leave + sick_leave + casual_leave);
		System.out.println("leave Balance =" + total);

	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (no_of_leaves < total_leaves)
			return true;
		else
			return false;
	}

	void calculate_salary() {  //Calculating salary 
		float hra = (float) 30.50;
		int rate = 1000;
	
		double totalSalary = hra * rate;
		
		System.out.println("Salary =" + totalSalary);

	}

}
