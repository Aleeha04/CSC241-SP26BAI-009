public class Demo{
	public static void main(String args[]){
		Product p1 = new Product("A", 100.99, 2);
		p1.display();
		Product p2 = new Product("B", 78.22, 3);
		p2.display();
		Product p3 = new Product("C", 58.73, 1);
		p3.display();
		Product p4 = new Product("D", 86, 4, new Date(2,3,2026));
		p4.display();
		}
	}