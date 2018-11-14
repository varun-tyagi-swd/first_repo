package LogicBasedSolution.QwickCilverWorkbook;

enum CardDenominations
{
    A(100), B(200), C(500), D(1000), E(2000), F(5000);

    private int cardVal;
    CardDenominations(int cardVal){
        this.cardVal = cardVal;
    }
    public int getCardVal(){
        return cardVal;
    }
}

