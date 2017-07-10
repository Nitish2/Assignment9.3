package AbstractClass;

class PermanentEmp extends Employee {

	PermanentEmp(int id, String name, int total, double sal) { // Declaring Constructor
																

		super(id, name, total, sal); // Super
	}

	int paid_leave = 10, sick_leave = 7, casual_leave = 2; // Assigning values to the variables.
															
	double basic = 20000, hra = 5000, pfa = 2000;

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

	void calculate_salary() {

		double hra = .5f * basic;
		double da = .2f * basic;
		double totalSalary = total_salary + (hra + da) - pfa;
		System.out.println("Salary =" + totalSalary);

	}
}
