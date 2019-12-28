package javapractice;

public class Library extends Student{
   protected int countBooksIssued;
   protected int booksDue;
    
    public Library(int regno,String stdname,String group,int countBooksIssued,int booksDue){
    super(regno,stdname,group);
    this.countBooksIssued = countBooksIssued;
    this.booksDue  = booksDue;
    }
    
    public void disp(){
    	System.out.println(regno+" "+stdname+" "+group+" "+countBooksIssued+" "+booksDue);
    }
	/* public static void main(String[] args) {
		Library lib = new Library(1001,"Shravya","ETM",20104,4);
		lib.disp();

	} */

}
