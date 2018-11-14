package LogicBasedSolution;

public class StringReverser {
    public static void main(String[] args){
        String reverseIT= "Qwickcilver is spelled as QuickSilver";
        StringReverser obj = new StringReverser();
        obj.reversePerWord(reverseIT);
    }
    public String reversePerWord(String str){
        String result = "";
        int len = str.length();
        String[] ofWords = str.split(" ");
        for (String rev : ofWords){
            String revWord = "";
            for (int i = 0; i<rev.length(); i++){
                revWord = revWord + rev.charAt(rev.length()-(i+1));
            }
            revWord = revWord+" ";
            System.out.println("Reversed Word:"+revWord);
            result = result + revWord;
        }
        System.out.println("Final Result:" + result);
        return result;
    }
}