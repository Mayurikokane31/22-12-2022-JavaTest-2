package InvoiceItem;

public class InvoiceItem {
private String id;
private String desc;
private int qty;
private double unitPrice;
public double total;

public InvoiceItem() {
	super();
	
}
public InvoiceItem( String id,String desc ,int qty , double unitPrice) {
	super();
	this.id =id;
	this.desc=desc;
	this.qty=qty;
	this.unitPrice=unitPrice;
	
}
public String getId() {
	return id;
}
public void setID() {
	this.id =id;
}
public String getDesc() {
	return desc;
}
public void setDesc() {
	this.desc=desc;
}

public int getQty() {
	return qty;
	
}
public void setQty() {
	this.qty=qty;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice() {
	this.unitPrice=unitPrice;
}
public double getTotal() {
	return unitPrice*qty;
}
public String tostring() {
	return "InvoiceItem :\n Id :"+id+ "\ndesc : " +desc+"\nqty :" +qty+"\n unitPrice : "+unitPrice;
}
}
