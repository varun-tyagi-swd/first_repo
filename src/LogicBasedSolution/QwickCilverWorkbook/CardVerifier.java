package LogicBasedSolution.QwickCilverWorkbook;

import java.util.Date;

//Workbook Excercise one AcmeRetails Card Number
public class CardVerifier {

    public static void main(String[] args) {

        OneTimeTopUp ottu = new OneTimeTopUp();
        int value = CardDenominations.C.getCardVal();
        CardNumberGenerator cng = new CardNumberGenerator();

        Cards cardOne = new Cards(cng.giftCardNumberGenerator(), value, "QwickCilver");
        System.out.println(value);
        cardOne.setCardNumber(cng.giftCardNumberGenerator());
        int defaultExpirationPeriod = 1;
        System.out.println("CardHolder Name:"+cardOne.getCardHolderName());
        System.out.println("Card Number:"+cardOne.getCardNumber());
        System.out.println("Card Value:" +cardOne.getValue());

        cardOne.setValue(ottu.cardTopUpValue(cardOne.getValue(),5));
        System.out.println("Card Value After Topup:" + cardOne.getValue());
        SubscriptionCalculator sc = new SubscriptionCalculator();
        Date subexDate;
        subexDate = sc.subcriptionPeriodCalculator();
        System.out.println("Subscription Expiration:" + subexDate);

        LoyaltyCards lc = new LoyaltyCards(cng.giftCardNumberGenerator(), CardDenominations.F.getCardVal(),
                "QwickQwick", "ExtremePass");
        System.out.println(lc.getCardNumber());
    }
}