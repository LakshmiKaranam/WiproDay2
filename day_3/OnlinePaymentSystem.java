package day_3;

abstract class PaymentMethod{
	public abstract void processPayment(double amount);
}

class CreditCard extends PaymentMethod{
	private static double fee_percent=2.0;
	@Override
	public void processPayment(double amount) {
		double fee=(fee_percent/100)*amount;
		double total=amount+fee;
		System.out.println("Process CreditCard Payment:");
		System.out.println("Original Amount: "+amount+" "+"Fee: "+fee+" "+"Total Charged: "+total);
	}
}

class PayPal extends PaymentMethod{
	@Override
	public void processPayment(double amount) {
		System.out.println("Process CreditCard Payment:");
		System.out.println("Amount: "+amount+"(No Additional Cost)");

	}
}

public class OnlinePaymentSystem {
	
	public static void processTransaction(PaymentMethod paymentMethod,double amount) {
		paymentMethod.processPayment(amount);
	}

	public static void main(String[] args) {
		
		PaymentMethod creditcard=new CreditCard();
		PaymentMethod paypal=new PayPal();
		processTransaction(creditcard,100);
		System.out.println();
		processTransaction(paypal,100);
	}

}
