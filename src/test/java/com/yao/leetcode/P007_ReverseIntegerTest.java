package com.yao.leetcode;

import junit.framework.TestCase;

/**
 * Created by yao on 15/6/30.
 */
public class P007_ReverseIntegerTest extends TestCase {

    private P007_ReverseInteger reverseInteger=new P007_ReverseInteger();

    public void testReverse() throws Exception {

        System.out.println(reverseInteger.reverse(-1234));
        System.out.println(reverseInteger.reverse(-1230));
        System.out.println(reverseInteger.reverse(12000));
        System.out.println(reverseInteger.reverse(-1234));

    }
}