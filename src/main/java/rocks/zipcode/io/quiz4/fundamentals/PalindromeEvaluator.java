package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {

    StringEvaluator se = new StringEvaluator();

    public static String[] getAllPalindromes(String string) {

        String [] arr = getAllSubstrings(string);
        List<String> myList = new ArrayList<String>();

        for (int i=0;i<arr.length;i++){

       if( arr[i].equalsIgnoreCase(reverseString(arr[i]))){

            myList.add(arr[i]);

            }


        }
  String [] retarr = new String[myList.size()];

        myList.toArray(retarr);
        return retarr;

    }


    public static Boolean isPalindrome(String string) {

        int n = string.length();
        for (int i = 0; i < (n/2); ++i) {
            if (string.charAt(i) != string.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }








    public static String reverseString(String string) {






        String reverse = "";
        for(int i = string. length() - 1; i >= 0; i--)
        {
            reverse = reverse + string. charAt(i);
        }

        return reverse;
    }


    public static String[] getAllSubstrings(String string) {
        int substringsCount = string.length() * (string.length() + 1) / 2;


        Set<String> myset = new HashSet<String>() {
        };
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                myset.add(string.substring(i, j));
                // System.out.println(list);
            }

        }
        String[] stockArr = myset.toArray(new String[0]);


        return stockArr;
    }



}

