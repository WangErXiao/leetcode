package com.yao.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by yao on 15/6/23.
 */
public class P004_Median_Of_Two_Sorted_ArraysTest extends TestCase {


    private P004_Median_Of_Two_Sorted_Arrays medianOfTwoSortedArrays=new P004_Median_Of_Two_Sorted_Arrays();
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        int[]a={};
        int[]b={2,3};
        System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(a,b));

    }
}