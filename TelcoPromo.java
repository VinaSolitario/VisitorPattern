public class TelcoPromo {
    public static void main(String[] args) {
        // Create Telco objects
        Telco smart = new Telco("Smart", 500, 15, false);  // Ensure it's of type Telco
        Telco globe = new Telco("Globe", 450, 10, true);    // Ensure it's of type Telco
        Telco ditto = new Telco("Ditto", 400, 8, true);     // Ensure it's of type Telco

        // Create instances for the usage promo and unlimited call text packages
        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        // Display Data Usage Offers
        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        // Display Unlimited Call/Text Packages
        System.out.println("\nSmart unlimited calls and text package: " +
                unli.showUnliCallTextOffer(smart.getTelcoName(), smart.getUnlimitedCallText()));
        System.out.println("Globe unlimited calls and text package: " +
                unli.showUnliCallTextOffer(globe.getTelcoName(), globe.getUnlimitedCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
                unli.showUnliCallTextOffer(ditto.getTelcoName(), ditto.getUnlimitedCallText()));

        // Display date allowance (how many days each promo lasts)
        System.out.println("\nSmart's Date Allowance: " + smart.getDateAllowance() + " days.");
        System.out.println("Globe's Date Allowance: " + globe.getDateAllowance() + " days.");
        System.out.println("Ditto's Date Allowance: " + ditto.getDateAllowance() + " days.");
    }
}
