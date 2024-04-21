package labSwk4_v2;

public class UnliCallTextPackage implements UnliCallTextOffer{
	@Override
	public String showUnliCallTextOffer(Telco telco) {
		String out="";
		if (telco.isUnliCallText()) {
			if (telco.getTelcoName().equals("Globe"))
				out = "only applies to same network";
			else if (telco.getTelcoName().equals("Ditto"))
				out = "applies to all networks";
		}
		else
			out = "none";
		return out;
	}
}
