package week1.day2.assignments;

public class EmployeeDetails {

	public void printEmployeeName(String empName, int empId) {
		System.out.println(empName);
		System.out.println(empId);

	}

	String getEmployeeAddress(String empAddress) {
		return empAddress;

	}

	private void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);

	}

	private long printEmployeeMobileNumber(long mobNum) {
		return mobNum;
	}

	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Kamal", 365478);
		String address = obj.getEmployeeAddress("Kerala");
		System.out.println(address);
		obj.printEmployeeSalary(55000.567);
		System.out.println(obj.printEmployeeMobileNumber(963852741));

	}

}
