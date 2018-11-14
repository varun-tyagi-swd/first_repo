package LogicBasedSolution.QwickCilverWorkbook;

public class LoyaltyCards extends Cards {

    private String PIN;

    public LoyaltyCards(){
    }

    public LoyaltyCards(String cardNumber, int value, String CardHolderName, String PIN){
        this.setCardNumber(cardNumber);
        this.setValue(value);
        this.setCardHolderName(CardHolderName);
        this.PIN = PIN;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
}
