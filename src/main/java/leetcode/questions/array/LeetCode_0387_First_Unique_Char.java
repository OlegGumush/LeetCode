package leetcode.questions.array;

//        387. First Unique Character in a String
//        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//        Example 1:
//        Input: s = "leetcode"
//        Output: 0
//
//        Example 2:
//        Input: s = "loveleetcode"
//        Output: 2
//
//        Example 3:
//        Input: s = "aabb"
//        Output: -1

public class LeetCode_0387_First_Unique_Char {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));

    }

    public static int firstUniqChar(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}