package LogicBasedSolution.QwickCilverWorkbook;

public class OneTimeTopUp {

    public int cardTopUpValue(int valueOfCard, int topUpFactor){
        int finalCardValue;
        finalCardValue = valueOfCard + (valueOfCard * topUpFactor/100);
        return finalCardValue;
    }

}
