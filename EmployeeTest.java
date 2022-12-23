
public class EmployeeTest {


		public static void main(String[] args) {
			System.out.println("-----------Emplopyee Record--------");
			Employee emp1 =  new Employee(  1 ,"Mayuri" ,"Kokane" ,35000 );
	      System.out.println(emp1);
	     double sal =emp1.Raisesalary(35000);
           System .out.println("Raise Salary :"+sal);
	      int annsal = emp1.Annualsalary(20000);
	      System.out.println("Annual Salary :" +annsal);
		}


	}


