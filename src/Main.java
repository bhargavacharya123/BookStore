import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<Book> al = new ArrayList<Book>(); 
	Scanner sc = new Scanner(System.in);
	void addBook()
	{
		System.out.println("Enter the bno ");
		int bno = sc.nextInt();
		
		System.out.println("Enter the bname");
		
		String bname = sc.next();
		
		System.out.println("Enter the bprice");
		double bprice = sc.nextDouble();
		
		System.out.println("Enter the bauthor");
		String bauthor = sc.next();
		
		Book b = new Book(bno,bname,bprice,bauthor);
		
		al.add(b);
		
		System.out.println("Book Added successfully");
		
		
	}
	void viewBooks()
	{
		System.out.println("The available books with us");
		
		for(Book b1 : al)
		{
	   System.out.println(b1.getBno()+" "+b1.getBname()+" "+
		b1.getBprice()+" "+b1.getBauthor());
		}
		
		System.out.println("======================================");
	}
	void updateBook()
	{
		
	}
	void deleteBook()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Welcome To BOOK STORE APP");
		System.out.println("==========================");
		Main m = new Main();
	    do 
	    {
	    	System.out.println("1. Add Book");
	    	System.out.println("2. View Books");
	    	System.out.println("3. Udate Book");
	    	System.out.println("4. Delete Book");
	    	System.out.println("5. Exit");
	    	ch = sc.nextInt();
	    	switch(ch)
	    	{
	    	case 1:
	    		
	    		   m.addBook();
	    		
	    		    break;
	    	case 2:
	    		    m.viewBooks();
	    		    break;
	    	case 3:
	    		    break;
	    	case 4:
	    		     break;
	    	case 5:
	    		  System.out.println("Thank you for using our services");
	    		     break;
	    		     
	    	}
	    }
	    while(ch != 5);
	}

}
