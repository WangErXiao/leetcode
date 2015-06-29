package com.yao.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by yao on 15/6/29.
 */
public class P006_ZigZagTest extends TestCase {


    private P006_ZigZag zigZag=new P006_ZigZag();

    @Test
    public void testConvert() throws Exception {

        String str1="abcefghijlmnopqrst";
        System.out.print(zigZag.convert(str1,4));

    }
}