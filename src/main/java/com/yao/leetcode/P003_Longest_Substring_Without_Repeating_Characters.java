package com.yao.leetcode;

import java.util.*;

/**
 * Created by yao on 15/6/22.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * For example,
 *
 * the longest substring without repeating letters for "abcabcbb" is "abc",
 *
 * which the length is 3.
 *
 * For "bbbbb" the longest substring is "b", with the length of 1.
 *
 */
public class P003_Longest_Substring_Without_Repeating_Characters {


        public int lengthOfLongestSubstring(String s) {

                if(s==null||s.length()==0)
                        return 0;

                int max=0;
                Map<Character,Integer> charMap=new HashMap<>();
                char[]allChars=s.toCharArray();

                for (int i=0;i<allChars.length;i++){
                        if(charMap.containsKey(allChars[i])){
                                i=charMap.get(allChars[i]);
                                charMap.clear();
                        }else{
                            charMap.put(allChars[i], i);
                            if(charMap.size()>max){
                                max=charMap.size();
                            }
                        }
                }
                return max>charMap.size()?max:charMap.size();
        }

    public int lengthOfLongestSubstringA(String s) {
        if(s==null)
            return 0;
        boolean[] flag = new boolean[256];

        int result = 0;
        int start = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];
            if (flag[current]) {
                result = Math.max(result, i - start);
                for (int k = start; k < i; k++) {
                    if (arr[k] == current) {
                        start = k + 1;
                        break;
                    }
                    flag[arr[k]] = false;
                }
            } else {
                flag[current] = true;
            }
        }

        result = Math.max(arr.length - start, result);

        return result;
    }

}

