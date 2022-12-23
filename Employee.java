
public class Employee {
	          int id ;
			private String fName;
			private String lName;
			private double salary; 
			
public Employee() {
			
		}
public Employee( int id , String fName , String lName , double salary) {
	super();
			 this.id=id;
			 this.fName=fName;
			 this.lName=lName;
			 this.salary=salary;
//			 if(salary <0.0)
//					salary=0.0;
              }

public int getid(int id){
	 return id;
}
public void setid(int id) {
		this.id = id; 
}

public String getfName(String fName){
	 return fName;
}
 public void setftName(String fName) {
		this.fName = fName; 
}

 public String getlName(String lName){
	 return lName;
}
public void setltName(String lName) {
		this.lName = lName; 
}
public double getsalary(double salary){
	 return salary;
}
public void setsalary(double salary) {
		this.salary = salary; 
}

public double Raisesalary(double amount){
	salary =salary+(10*amount);
			return salary;
}

public int Annualsalary(int sal) {
	return sal=sal*12;
}
public String toString() {
	 return "\nID :"+id+  "\n FirstName : " +fName + "\n LastName : "+lName + "\n salary :"+salary;

}
	}

