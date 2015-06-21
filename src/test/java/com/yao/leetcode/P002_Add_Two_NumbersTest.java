package com.yao.leetcode;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by yao on 15/6/21.
 */
public class P002_Add_Two_NumbersTest extends TestCase {


    private P002_Add_Two_Numbers p002AddTwoNumbers=new P002_Add_Two_Numbers();

    public void testAddTwoNumbers() throws Exception {

        //(2 -> 4 -> 3) + (5 -> 6 -> 4)
        P002_Add_Two_Numbers.ListNode node11=new P002_Add_Two_Numbers.ListNode(2);
        P002_Add_Two_Numbers.ListNode node12=new P002_Add_Two_Numbers.ListNode(4);
        P002_Add_Two_Numbers.ListNode node13=new P002_Add_Two_Numbers.ListNode(3);
        node11.next=node12;
        node12.next=node13;

        P002_Add_Two_Numbers.ListNode node21=new P002_Add_Two_Numbers.ListNode(5);
        P002_Add_Two_Numbers.ListNode node22=new P002_Add_Two_Numbers.ListNode(6);
        P002_Add_Two_Numbers.ListNode node23=new P002_Add_Two_Numbers.ListNode(4);
        node21.next=node22;
        node22.next=node23;

        P002_Add_Two_Numbers.ListNode result=p002AddTwoNumbers.addTwoNumbers(node11, node21);

        Assert.assertTrue(result.val==7);
        Assert.assertTrue(result.next.val==0);
        Assert.assertTrue(result.next.next.val==8);


        P002_Add_Two_Numbers.ListNode node31=new P002_Add_Two_Numbers.ListNode(0);

        P002_Add_Two_Numbers.ListNode node41=new P002_Add_Two_Numbers.ListNode(9);
        P002_Add_Two_Numbers.ListNode node42=new P002_Add_Two_Numbers.ListNode(1);
        P002_Add_Two_Numbers.ListNode node43=new P002_Add_Two_Numbers.ListNode(6);
        node41.next=node42;
        node42.next=node43;


        P002_Add_Two_Numbers.ListNode result1=p002AddTwoNumbers.addTwoNumbers(node41, node31);


        Assert.assertTrue(result1.next.next.val==6);



    }
}