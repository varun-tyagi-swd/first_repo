package LogicBasedSolution.QwickCilverWorkbook;

import java.io.*;

public class CardNumberGenerator {

    private File cardNumbers = new File("CardsNumbers.qcd");
    private String initialIdentifiers = "17777000";
    private int stratingDigits = 10000001;

    public String giftCardNumberGenerator(){
        String newCardNumber;
        newCardNumber = formedCardNumber();
        return newCardNumber;
    }

    public String formedCardNumber(){
        try{
            if (cardNumbers.createNewFile()){
                System.out.println("Created File At: " + cardNumbers.getAbsolutePath());
            }
            if (cardNumbers.length() == 0 ){
                System.out.println("Creating First Number");
                String firstFormedNumber = initialIdentifiers + stratingDigits;
                putCardNumberinFile(cardNumbers, firstFormedNumber);
            } else {
                System.out.println("Extracting Last Number");
                String lastnumber = extractCardFromFile(cardNumbers);
                if (lastnumber.length() == 16){
                    Integer lastEightDigits = Integer.parseInt(lastnumber.substring(8,16));
                    System.out.println("Last Eight Digits:" + lastEightDigits);
                    lastEightDigits = lastEightDigits+1;

                    String generatedCardNumber = initialIdentifiers+lastEightDigits;
                    System.out.println("Generated Card Number:" + generatedCardNumber);
                    putCardNumberinFile(cardNumbers, generatedCardNumber);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return extractCardFromFile(cardNumbers);
    }

    public boolean putCardNumberinFile(File f, String formedCardNumber){
        boolean result = false;
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.append(formedCardNumber);
            fw.append("\n");
            fw.close();
            result = true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    public String extractCardFromFile(File f){
        String line, last = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            while ((line = br.readLine()) != null){
                last = line;
            }
            System.out.println("Last Number:" + last);
            br.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return last;
    }
}
