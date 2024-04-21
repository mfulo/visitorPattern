package labSwk4_v2;

public class Telco implements TelcoSubscription {
	private String telcoName;
	private double promoPrice;
	private int dataAllowance;
	private boolean unliCallText;
	
	public Telco (int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
		this.dataAllowance = dataAllowance;
		this.promoPrice = promoPrice;
		this.telcoName = telcoName;
		this.unliCallText = unliCallText;
	}
	
	public String getTelcoName() {
		return telcoName;
	}

	public double getPromoPrice() {
		return promoPrice;
	}

	public int getDataAllowance() {
		return dataAllowance;
	}

	public boolean isUnliCallText() {
		return unliCallText;
	}

	@Override
	public String accept(UsagePromo usagePromo) {
		return usagePromo.showAllowance(this);
	}

	@Override
	public String accept(UnliCallTextOffer unliCallTextOffer) {
		return unliCallTextOffer.showUnliCallTextOffer(this);
	}
}
