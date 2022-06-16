public class book {
	private  String isbn;
	private  String bookTitle;
	private  String authorName;
	private  double price;
	private  int availableQuantity;
	
	public book(){}
	public book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public String getIsbn(String isbn)
	{
		return isbn;
	}
	
	
		public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public String getBookTitle(String bookTitle)
	{
		return bookTitle;
	}
	
	
	
		public void setAuthorName(String authorName)
	{
		this.authorName= authorName;
	}
	public String getAuthorName(String authorName)
	{
		return authorName;
	}
	
	
		public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice(double price)
	{
		return price;
	}
	
	
		public void setAvaiableQuantity (int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public String getAvaiableQuantity(String availableQuantity)
	{
		return availableQuantity;
	}
	public void addQuantity(int amount){
		 availableQuantity = availableQuantity + amount;
	}
    public void sellQuantity(int amount){
		 availableQuantity = availableQuantity - amount;
	}
	
	public void showDetails(){
		
		    System.out.println("ISBN                                   : "+isbn);
            System.out.println("Book Title                             : "+bookTitle);
            System.out.println("Author Name                            : "+authorName);
            System.out.println("Price                                  : "+price+ " USD");
            System.out.println("Available Quantity                     : "+availableQuantity);
		
	}
	
	public static void main (String args[]){
		
		book b = new book();
		b.setIsbn("012 5843 61542");
		b.setBookTitle("Steal Like an ARTIST");
		b.setAuthorName("Austin Kleon");
		b.setPrice(15);
		b.setAvaiableQuantity(52);
		b.sellQuantity(24);
		b.addQuantity(100);
		b.showDetails();
	}
	
	
	
}