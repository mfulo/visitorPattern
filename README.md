# <p align=center>Visitor Design Pattern</p>
## Problem
Imagine you are looking for a new mobile plan for your smartphone. Three major telecommunication providers are offering enticing deals: Smart, Globe, and Ditto. 
- Smart: Offers a data allowance of 15 GB for ₱500 per month. However, they do not offer any free calls or texts, and you will be charged per use.
- Globe: Provides a data allowance of 10 GB for ₱450 per month. This plan comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.
- Ditto: Offers a data allowance of 8 GB for ₱400 per month. This plan includes unlimited calls and texts to all networks within the country.

Implement the visitor design pattern.

## UML Diagram

## Test code
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
     
## Sample Output
![image](https://github.com/mfulo/visitorPattern/assets/142382665/9a02e4c7-0fa2-41f1-9385-80287d44366e)

