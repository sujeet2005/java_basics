package Programs;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdfasdfafkasd234asda";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 
        //Converting given string to char array
 
        char[] strArray = str.toCharArray();
 
        //checking each char of strArray
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
 
                charCountMap.put(c, 1);
            }
        }
 
        //Printing the charCountMap
 
        System.out.println(charCountMap);
    }

}
