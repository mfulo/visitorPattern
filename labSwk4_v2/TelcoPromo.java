package labSwk4_v2;

public class TelcoPromo {
	public static void main(String[] args) {
		TelcoSubscription smart = new Telco(15, 500, "Smart", false);
	    TelcoSubscription globe = new Telco(10, 450, "Globe", true);
	    TelcoSubscription ditto = new Telco(8, 400, "Ditto", true);
	
	    UsagePromo promo = new TelcoAllowance();
	    UnliCallTextOffer unli = new UnliCallTextPackage();
	
	    System.out.println("Smart Data Usage Offer and Price: " + smart.accept(promo));
	    System.out.println("Globe Data Usage Offer and Price: " + globe.accept(promo));
	    System.out.println("Ditto Data Usage Offer and Price: " + ditto.accept(promo));
	    
	    System.out.println("\nSmart Unlimited Calls and Text Package: " + smart.accept(unli));
	    System.out.println("Globe Unlimited Calls and Text Package: " + globe.accept(unli));
	    System.out.println("Ditto Unlimited Calls and Text Package: " + ditto.accept(unli));
	}
}
