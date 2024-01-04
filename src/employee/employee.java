package employee;

public class employee {
	private int eid;
	private String ename;
	private String desgn;
	private double sal;
	private int  age;
	public employee(int eid, String ename, String desgn, double sal ) {
	 
		this.eid = eid;
		this.ename = ename;
		this.desgn = desgn;
		this.sal = sal;
 S	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn = desgn;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", desgn=" + desgn + ", sal=" + sal + ", age=" + age + "]";
	}
	
	

}
