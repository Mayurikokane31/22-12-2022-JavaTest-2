package InvoiceItem;

public class InvoiceItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceItem itm1 =new InvoiceItem("1","product is good",2,3000);
		System .out.println("-------------product details-------");
		System .out.println(itm1);
		double b1=itm1.getTotal();
		System.out.println("total ammount :"+b1);
		
		
	}

}
