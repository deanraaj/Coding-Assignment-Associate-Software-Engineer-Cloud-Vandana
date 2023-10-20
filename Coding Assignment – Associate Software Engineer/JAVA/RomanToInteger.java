package JAVA;

import java.util.*;
public class RomanToInteger {
    public static int romanTointeger(String s) {
        // Declare hash map and store Roman Value in Key Value format
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        
        int ans = hm.get(s.charAt(s.length()-1));
        
        for(int i = s.length() - 2; i >= 0; i--) {
            int curr = hm.get(s.charAt(i));
            int prev = hm.get(s.charAt(i+1));
            if(curr >= prev) {
                ans = ans + curr;
            } else {
                ans = ans-curr;
            }
        }
       return ans;

    }
    public static void main(String[] args) {
        // declare scanner class for taking input
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Roman Number : ");
        // taking Roman number 
        String romanNum = in.next();

        System.out.println("Integer value : " + romanTointeger(romanNum));
    }
}

