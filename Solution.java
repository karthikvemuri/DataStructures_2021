import java.io.*;
import java.util.*;

public class Solution {
        public static int lengthOfLongestSubstring(String s) {

            //Sliding window approach
            int wStart = 0, maxLen = 0;

            //Hashmap to store the index of each char processed
            Map<Character, Integer> charMap = new HashMap<>();

            for(int wEnd = 0; wEnd < s.length(); wEnd++){
                char endChar = s.charAt(wEnd);

                //shrink the window if the char is already present
                if(charMap.containsKey(endChar)){
                    wStart = Math.max(wStart, charMap.get(endChar) + 1);

                }
                charMap.put(endChar, wEnd);
                maxLen = Math.max(maxLen, wEnd - wStart + 1);
            }

            return maxLen;
        }

        public static void main(String [] args){
            String s = "abcabcbb";
            int len =  lengthOfLongestSubstring(s);

            System.out.println("Longest substring without repeating characters is " + len + " chars long");
        }
}


