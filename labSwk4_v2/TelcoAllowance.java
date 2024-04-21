package labSwk4_v2;

public class TelcoAllowance implements UsagePromo {
	@Override
	public String showAllowance(Telco telco) {
		return telco.getDataAllowance() + " GB of data for ₱" + telco.getPromoPrice();
	}
}
