package week1.day2.assignments;

public class TwoWheeler {
	
	int noOfWheels =2;
	short noOfMirrors=1;
	long chassisNumber=89765243L;
	boolean isPunctured=false;
	String bikeName="Saluto";
	double runningKM=199256;
	
	public static void main(String[] args) {
		TwoWheeler obj=new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}

}
