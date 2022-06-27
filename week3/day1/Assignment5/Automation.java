package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language, TestTool {
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.selenium();
		obj.java();
		obj.ruby();
		obj.python();
	}

	@Override
	public void selenium() {
		System.out.println("Method declared in TestTool Interface and defined in automation class");

	}

	@Override
	public void java() {
		System.out.println("Method declared in language Interface and defined in automation class");

	}

	@Override
	public void ruby() {
		System.out.println("Method declared in Multiplelanguage class and defined in automation class");
	}

}
