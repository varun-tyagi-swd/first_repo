package LogicBasedSolution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateCounter {

    public static void main(String []args){
        int [] x = {1,1,2,3,1,4,3,2,5,6,4,3,2,4,5,1,8,1,
                2,3,8,6,5,4,6,7,6,4,3,4,5,6,8,9,7,6,5,4,3,
                12,23,2,4,45,65,45,34,64,65,74,8,56,765,678,456,43,456,
                16,17,36,34,37,27,35,6,7,89,56,67,78,246,4,76,34,98,76,1};
        DuplicateCounter obj = new DuplicateCounter();
        Map results = obj.duplicateOrganizer(x);
        obj.printMapResults(results);
    }

    public Map<Integer,Integer> duplicateOrganizer(int [] x){
        Map<Integer, Integer> resultedPairs = new HashMap<>();
        Set<Integer> keys = new HashSet<>();
        for(int i = 0; i < x.length; i++){
            if(keys.contains(x[i])){
                System.out.println("Found Key");
                resultedPairs.put(x[i],resultedPairs.get(x[i]) + 1);
            } else{
                System.out.println("Keys do not have value");
                resultedPairs.put(x[i],1);
            }
            keys = resultedPairs.keySet();
        }
        return resultedPairs;
    }
	
	//print map data
    public void printMapResults(Map<Integer,Integer> toBePrinted){
        for (Map.Entry<Integer, Integer> entry: toBePrinted.entrySet()){
            System.out.println("Number:" + entry.getKey() + "\tTotal Occurances:" + entry.getValue());
        }
    }
}
