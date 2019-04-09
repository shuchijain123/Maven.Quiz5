package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {


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



    public static String[] getCommonSubstrings(String string1, String string2) {


String[] arr1= getAllSubstrings(string1);
String[] arr2=getAllSubstrings(string2);

List<String> list1= Arrays.asList(arr1);
List<String> list2 = Arrays.asList(arr2);


        Set<String> set=new LinkedHashSet<String>(Arrays.asList(arr1));
        set.retainAll(Arrays.asList(arr2));
        String[] stockArr = set.toArray(new String[0]);


        return stockArr;





    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String [] common = getCommonSubstrings(string1,string2);

        int maxLength = 0;
        String longestString = null;
        for (String s : common) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }



}

