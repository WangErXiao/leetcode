package com.yao.leetcode;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by yao on 15/7/1.
 */
public class P008_String_To_IntegerTest extends TestCase {

    private P008_String_To_Integer stringToInteger=new P008_String_To_Integer();
    public void testMyAtoi() throws Exception {

        System.out.println(stringToInteger.myAtoi("21474836479"));
        System.out.println(stringToInteger.myAtoi("-2147483648"));
        System.out.println(stringToInteger.myAtoi("-2147483647"));
        System.out.println(stringToInteger.myAtoi("-2147483649"));
        System.out.println(stringToInteger.myAtoi("-1234567890"));

    }
}