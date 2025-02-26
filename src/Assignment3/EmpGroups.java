package Assignment3;

public class EmpGroups {

	/*
	 * Create an Employees class that stores the following employee names and IDs in separate variables:
		• Employee Names: "Bharath", "ABC", "XYZ"
		• Employee IDs: 1234, 1235, 1236
		Then, create another class called EmpGroups that contains two arrays to store the employee names
		and IDs.
		Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
		name along with their corresponding ID.
		Example:
		• Employee Name: Bharath, Employee ID: 1234
	 */
	
	public static void main(String[] args) {
		
		Employess obj = new Employess();
		
		String empName[] = new String[3];
		
		int id[] = new int[3];
		
		empName[0] = obj.emp1;
		empName[1] = obj.emp2;
		empName[2] = obj.emp3;
		
		id[0] = obj.id1;
		id[1] = obj.id2;
		id[2] = obj.id3;
		
		System.out.println("Employee Name:" + empName[0]+ " & Employee ID:" + id[0]);
		System.out.println("Employee Name:" + empName[1]+ " & Employee ID:" + id[1]);
		System.out.println("Employee Name:" + empName[2]+ " & Employee ID:" + id[2]);

		
	}

}
