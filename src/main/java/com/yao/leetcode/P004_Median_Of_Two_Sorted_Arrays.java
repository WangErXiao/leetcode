package com.yao.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yao on 15/6/23.
 *
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 */
public class P004_Median_Of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1==null&&nums2==null){
            return 0;
        }
        if(nums1!=null&&(nums2==null||nums2.length==0)){
            if(nums1.length>0){
                if(nums1.length%2==0){
                    return (nums1[nums1.length/2-1]+nums1[nums1.length/2])/2.0;
                }else{
                    return nums1[nums1.length/2];
                }
            }
            return 0;
        }
        if((nums1==null||nums1.length==0)&&nums2!=null){
            if(nums2.length>0){
                if(nums2.length%2==0){
                    return (nums2[nums2.length/2-1]+nums2[nums2.length/2])/2.0;
                }else{
                    return nums2[nums2.length/2];
                }
            }
            return 0;
        }

        List<Integer> sums=new ArrayList<>();
        for (int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]>nums2[j]){
               sums.add(nums2[j]);
               j++;
            } else{
               sums.add(nums1[i]);
               i++;
            }
            if(i==nums1.length){
                for (;j<nums2.length;){
                    sums.add(nums2[j]);
                    j++;
                }
            }
            if(j==nums2.length){
                for (;i<nums1.length;){
                    sums.add(nums1[i]);
                    i++;
                }
            }
        }

        int[]arrs=new int[sums.size()];
        int n=0;
        for (Object obj:sums){
            arrs[n]=(int)obj;
            n++;
        }

        if(arrs.length>0){
            if(arrs.length%2==0){
                return (arrs[arrs.length/2]+arrs[arrs.length/2-1])/2.0;
            }else{
                return arrs[arrs.length/2];
            }
        }

        return 0;
    }
}
