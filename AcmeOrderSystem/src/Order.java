/**
 * Create an order that is able to print out price and tax totals.
 * 
 * @OceanSkyWeb
 */
public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	static double taxRate;
	
	{
		taxRate = 0.05;
	}
	
	/**
	 * Constructor that assigns parameters to instantiated object
	 * @param d Date
	 * @param amt Order Amount
	 * @param c Customer
	 * @param p Product
	 * @param q Quantity
	 */
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	public Order(MyDate d, double amt, String c) {
		this(d, amt, c, "Anvil", 500);
	}
	//Overwrite the toString method
	public String toString(){
		return quantity + " ea. " + product + " for customer " + customer; 
	}
	
	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}
	
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
}
