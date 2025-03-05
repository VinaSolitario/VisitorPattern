public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;  // Store the number of days for the data package
    private boolean unlimitedCallText;

    public Telco(String telcoName, double promoPrice, int dateAllowance, boolean unlimitedCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unlimitedCallText = unlimitedCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnlimitedCallText() {
        return unlimitedCallText;
    }

    public int getDateAllowance() {
        return dateAllowance;  // Getter for dateAllowance
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unlimitedCallText) {
        return unliPackage.showUnliCallTextOffer(telcoName, unlimitedCallText);
    }
}
