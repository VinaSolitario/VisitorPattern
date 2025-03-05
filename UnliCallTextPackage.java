public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallTextOffer(String telcoName, boolean UnliCallText) {
        if (UnliCallText) {
            return telcoName + " offers unlimited calls and texts.";
        } else {
            return telcoName + " does not offer unlimited calls and texts.";
        }
    }
}
