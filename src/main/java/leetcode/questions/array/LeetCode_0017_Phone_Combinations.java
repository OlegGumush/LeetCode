package leetcode.questions.array;

import java.util.*;

//        17. Letter Combinations of a Phone Number
//        Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//        A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

//        Example 1:
//        Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

//        Example 2:
//        Input: digits = ""
//        Output: []

//        Example 3:
//        Input: digits = "2"
//        Output: ["a","b","c"]

public class LeetCode_0017_Phone_Combinations {

    public static void main(String[] args) {
        System.out.println(letterCombinations("2355"));
    }

    static Map<Character, List<String>> map = new HashMap<>();

    static {
        map.put('2', Arrays.asList("a", "b", "c"));
        map.put('3', Arrays.asList("d", "e", "f"));
        map.put('4', Arrays.asList("g", "h", "i"));
        map.put('5', Arrays.asList("j", "k", "l"));
        map.put('6', Arrays.asList("m", "n", "o"));
        map.put('7', Arrays.asList("p", "q", "r", "s"));
        map.put('8', Arrays.asList("t", "u", "v"));
        map.put('9', Arrays.asList("w", "x", "y", "z"));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (!digits.isEmpty()) {
            result.addAll(map.get(digits.charAt(0)));
        }

        for (int i = 1; i < digits.length(); i++) {

            List<String> options = map.get(digits.charAt(i));
            List<String> temp = new ArrayList<>();

            for (int j = 0; j < result.size(); j++) {
                for (int k = 0; k < options.size(); k++) {
                    temp.add(result.get(j) + options.get(k));
                }
            }
            result = temp;
        }

        return result;
    }
}