public class Product{

	private Date manufacDate;
	private  String id;
	private String name;
	private double price;
	private int quantity;

	private static double maxPrice = 0;
	private static double minPrice = 0 ;
	private static int count=1;	

	public Product (String name, double price, int quantity){
		this(name, price, quantity, new Date(0, 0, 0));
		}

	public Product (String name, double price, int quantity, Date manufacDate){
		this.id = String.format("p%03d:",count++);

		this.name= name;
		this.price = price;
		this.quantity = quantity;
		this. manufacDate = manufacDate;
			
		if (price > maxPrice){
			this.maxPrice = price;
			this.minPrice = maxPrice;
			}
		if (price < minPrice){
			this.minPrice = price;
			}
	}

	public void display(){
		System.out.printf("ID : %s \n",id);
		System.out.println("Name :"+name);
		System.out.println("Price : Rs. "+price);
		System.out.println("Quantity : "+quantity);
		System.out.println("Maximum Price : " + maxPrice);
		System.out.println("Minimum Price : " + minPrice);
		System.out.printf("Manufacturing Date : %s \n", manufacDate.toString()) ;
		System.out.println("--------------------------------------");
	}
	}
	