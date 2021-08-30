package java_assignment2_Q2;

public class runner {
	public static void main(String[] args) {
		 Employee Emp = new Employee();
         Emp.setEmpName("Abhishek");
         Emp.setEmpAge(22);
         Emp.setEmpSSN(43453);
         System.out.println("Employee Name: " + Emp.getEmpName());
         System.out.println("Employee SSN: " + Emp.getEmpSSN());
         System.out.println("Employee Age: " + Emp.getEmpAge());
	}

}
