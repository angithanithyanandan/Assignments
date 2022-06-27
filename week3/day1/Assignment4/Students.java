package week3.day1.assignments;

public class Students {
	// learn method overloading
	public void getStudentInfo(int id) {
		System.out.println("ID is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("ID is " + id + " Name is " + name);
	}

	public void getStudentInfo(String mailID, long phonenumber) {
		System.out.println("mailID is " + mailID + " phonenumber is " + phonenumber);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(2560);
		obj.getStudentInfo(2560, "Aishu");
		obj.getStudentInfo("test@gmail.com", 567896456);
	}

}
