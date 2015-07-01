package com.yao.leetcode;

/**
 * Created by yao on 15/7/1.
 */
public class P008_String_To_Integer {

    public int myAtoi(String str) {
        boolean isNeg=false;
        int rel=0;
        str=str.trim();
        int len=str.length();
        int start=0;
        if(str.startsWith("-")){
            isNeg=true;
            start++;
        }else if(str.startsWith("+")){
            start++;
        }
        for (int i=start;i<len;i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return isNeg?-rel:rel;
            }
            if(rel>(Integer.MAX_VALUE-(str.charAt(i)-'0'))/10){
                if(isNeg){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
            rel=rel* 10 + (str.charAt(i)-'0');
        }
        return isNeg?-rel:rel;
    }
}
