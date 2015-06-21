package com.yao.leetcode;

/**
 * Created by yao on 15/6/21.
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 *
 * Output: index1=1, index2=2
 *
 *
 */

public class P001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        if (nums==null)
            return null;
        int[]rels=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    rels[0]=i+1;
                    rels[1]=j+1;
                    return  rels;
                }
            }
        }
        return null;
    }

}
