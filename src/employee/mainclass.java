package employee;

import java.util.Scanner;

public class mainclass {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 employeeService e=new  EmployeeServiceDp();
		 System.out.println("=====welcome To empolyee===");
		 while(true) {
			 System.out.println( " ==mean==");
			 System.out.println("1.create employee-Dp\n2.available index ");
			 System.out.println("\\n3.addemplee\n4.\\n5.  ");
			 System.out.println("6. \n7.exite");
			 
			 int op=sc.nextInt();
			 switch(op) {
			 case 1: System.out.println(" Enter the size of Db");
			     int size=sc.nextInt();
			          e. createEmployee(size);break;
			 case 2:e.avalableIndex();break;
			 case 3:System.out.println("enter th index");
			       
			 case 7: System.out.println("thank");
			 System.exit(0); break;
			 default:System.out.println("invalis no");
			 }
			 }
		 
		
		 
	}
}
