
public class Book {

	private int bno;
	
	private String bname;
	
	private double bprice;
	
	private String bauthor;

	public Book() {
		super();
	}

	public Book(int bno, String bname, double bprice, String bauthor) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.bprice = bprice;
		this.bauthor = bauthor;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getBprice() {
		return bprice;
	}

	public void setBprice(double bprice) {
		this.bprice = bprice;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	
	
	
}
