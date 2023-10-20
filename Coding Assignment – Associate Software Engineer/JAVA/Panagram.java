package JAVA;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        // Scanner class for reading input
        Scanner in = new Scanner(System.in);
        String s = "abcdefdgd";//in.next();

        // HashSet to count the number of types of characters
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char ch = Character.toLowerCase(c);
            set.add(ch);
        } 
        
        // if it is panagram, number of characters is 26
        if(set.size() == 26) {
            System.out.println(s + " is Panagram.");
        } else {
            System.out.println(s + " is not a Pangram");
        }

    }

}
