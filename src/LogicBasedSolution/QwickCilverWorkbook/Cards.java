package LogicBasedSolution.QwickCilverWorkbook;

public class Cards {

    private String cardNumber;
    private int Value;
    private String CardHolderName;

    public Cards(){
        //default constructor
    }

    public Cards(String cardNumber, int Value, String CardHolderName) {
        this.cardNumber = cardNumber;
        this.Value = Value;
        this.CardHolderName = CardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        CardHolderName = cardHolderName;
    }
}