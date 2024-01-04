package employee;

import java.util.Scanner;

public class EmployeeServiceDp implements employeeService {
   employee[] eDp;
	@Override
	public void createEmployee(int size) {
		eDp=new  employee[size];
		System.out.println();
 		
	}
	public void avalableIndex() {
		int c=0;
		System.out.println("====avaliable===");
		for(int i= 0;i<eDp.length;i++) {
			if(eDp[i]==null) {
				System.out.println(i+" ");
				c++;
			}
			
		}
		if(c==0) {
			System.out.println("Database id full");
			
		}
		System.out.println();
	}
	 
	 
	@Override
	public void addemployee(int in) {
		 Scanner sc=new Scanner(System.in);

			if(in>=eDp.length) {
				System.out.println(" invalid index no");
				
			}
			else if(eDp[in]!=null) {
				System.out.println(" its alreay full");
				
			}
			else {
				System.out.println("enter emp id");
				int eid=sc.nextInt();
				System.out.println(" enter emp name");
				String ename=sc.next();
				System.out.println("enter emp dge");
				String desgn=sc.next();
				System.out.println(" enter emp sal");
				double sal=sc.nextDouble();
				eDp[in]=new employee(eid,ename,desgn ,sal);
			}
	 		
 		
	}
	@Override
	public void displayallemp() {
		System.out.println("=====employee details==");
		int c=0;
		for(int i=0;i<eDp.length;i++) {
			if(eDp[i]==null) {
				System.out.println(eDp[i]);
				c++;
			}
 		}
		if(c==0) {
			System.out.println("data bese is empty");
		}
 		
	}
	@Override
	public void getempolyeedetailseid(int eid) {
		System.out.println(" employe by Eid");
		int c=0;
		
	for( employee ele:eDp) {
		if(ele!=null) {
			if(ele.getEid()==eDp) {
		}
		
	}
		
 		
	}
	@Override
	public void deleteEmployeeeid(int eid) {
		// TODO Auto-generated method stub
		
	}
	 
 
	

}
