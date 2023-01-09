package org.kunal.string;

import java.util.HashMap;
import java.util.Map;

public class FindFirstOccurrence {
    public static void main(String[] args) {
       String kk= "lleettcode";
        Map<Character, Integer> charCount = new HashMap<>(kk.length());

       for(int i =0; i< kk.length(); i++){
           if(charCount.containsKey(kk.charAt(i))){
               int count = charCount.get(kk.charAt(i));
               charCount.put(kk.charAt(i), count+1 );
           }else{
               charCount.put(kk.charAt(i), 1);
           }
       }
        for (int i =0; i< kk.length(); i++) {
            if(charCount.get(kk.charAt(i))==1){
                System.out.println(i);
                break;
            }
        };
    }
}
