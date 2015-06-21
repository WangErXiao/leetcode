package com.yao.leetcode;

/**
 * Created by yao on 15/6/21.
 *
 * You are given two linked lists representing two non-negative numbers.
 *
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 *
 * Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *
 * Output: 7 -> 0 -> 8
 */
public class P002_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isForward=false;
        ListNode head=null;
        while(l1!=null||l2!=null||isForward==true){
            ListNode tmp=null;
            if(l1!=null&&l2!=null){
               if(isForward){
                   tmp = new ListNode((l1.val + l2.val + 1) % 10);
                   if(l1.val+l2.val+1>9) {
                       isForward=true;
                   }else{
                       isForward=false;
                   }
               }else{
                   tmp=new ListNode((l1.val+l2.val)%10);
                   if(l1.val+l2.val>9){
                       isForward=true;
                   }else{
                       isForward=false;
                   }
               }
                if(head!=null){
                    ListNode lastNode=head;
                    while (lastNode.next!=null){
                        lastNode=lastNode.next;
                    }
                    lastNode.next=tmp;
                }else{
                    head=tmp;
                }
                l1=l1.next;
                l2=l2.next;
                continue;

            }else if(l1!=null&&l2==null){
                 if(isForward){
                     tmp=new ListNode((l1.val+1)%10);
                     if(l1.val+1>9){
                         isForward=true;
                     }else{
                         isForward=false;
                     }
                 }else{
                     tmp=new ListNode(l1.val);
                 }
                if(head!=null){
                    ListNode lastNode=head;
                    while (lastNode.next!=null){
                        lastNode=lastNode.next;
                    }
                    lastNode.next=tmp;
                }else{
                    head=tmp;
                }
                l1=l1.next;
                if(isForward){
                    continue;
                }else{
                    tmp.next=l1;
                    break;
                }
            }else if(l1==null&&l2!=null){
                if(isForward){
                    tmp=new ListNode((l2.val+1)%10);
                    if(l2.val+1>9){
                        isForward=true;
                    }else{
                        isForward=false;
                    }
                }else{
                    tmp=new ListNode(l2.val);
                }
                if(head!=null){
                    ListNode lastNode=head;
                    while (lastNode.next!=null){
                        lastNode=lastNode.next;
                    }
                    lastNode.next=tmp;
                }else{
                    head=tmp;
                }
                l2=l2.next;
                if(isForward){
                    continue;
                }else{
                    tmp.next=l2;
                    break;
                }
            }else{
                tmp=new ListNode(1);
                ListNode lastNode=head;
                while (lastNode.next!=null){
                    lastNode=lastNode.next;
                }
                lastNode.next=tmp;
                isForward=false;
            }

        }
        return head;

    }



    public static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }

}

