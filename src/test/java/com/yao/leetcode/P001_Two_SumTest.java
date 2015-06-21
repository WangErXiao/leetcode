package com.yao.leetcode;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yao on 15/6/21.
 */

public class P001_Two_SumTest extends TestCase {

    P001_Two_Sum p001TwoSum=new P001_Two_Sum();

    @Test
    public void testTwoSum() throws Exception {
        int[]nums=new int[]{1,3,2,4,8};
        Assert.assertTrue(p001TwoSum.twoSum(nums, 5)[0]==1);
        Assert.assertTrue(p001TwoSum.twoSum(nums, 5)[1]==4);
    }
}