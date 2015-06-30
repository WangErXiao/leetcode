package com.yao.leetcode;

/**
 * Created by yao on 15/6/30.
 */
public class P007_ReverseInteger {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        int num=Math.abs(x);
        int rel=0;
        while (num!=0){
            //防止溢出
            if(rel>(Integer.MAX_VALUE-num%10)/10)
                return 0;
            rel=num%10+rel*10;
            num=num/10;
        }

        return x>0?rel:-rel;
    }
}
