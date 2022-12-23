
public class Author {
 private String FirstName;
 private String LastName;
 private String BookName;
 
 public Author() {
	 
 }
 public Author (String FirstName ,String LastName,String BookName) {
	this.FirstName = FirstName;
	this.LastName = LastName;
	this.BookName =  BookName;
 }
 public String getFirstName(String FirstName){
	 return FirstName;
 }
 public void setFirstName(String FirstName) {
		this.FirstName = FirstName; 
 }
 
 public String getLastName(String LastName){
	 return LastName;
 }
 public void setLastName(String LastName) {
		this.LastName = LastName; 
 }
 
 public String getBookName(String BookName){
	 return BookName;
 }
 public void setBookName(String BookName) {
		this.BookName = BookName; 
 }
 
 public String toString() {
	 return "\n FirstName : " +FirstName + "\n LastName : "+LastName + "\n BookName :"+BookName;

 }
}
