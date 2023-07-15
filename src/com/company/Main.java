package com.company;

import com.company.lesson.*;
import com.company.onehundreddaysleetcode.ProductOfArrayExceptSelf;

public class Main {

    public static void main(String[] args) {
       // PushDominos pushDominos = new PushDominos();
        //pushDominos.pushDominoes(".L.R...LR..L..");
       // LinkedList ll= new LinkedList();
       // LinkedList.LinkNode node = ll.addToBeginning(4);
     //   node=ll.addToBeginning(3);
      //  ll.addToBeginning(2);
      //  ll.addToBeginning(1);
     //   ll.addToTheEnd(5);
     // var result=  ll.addToTheEnd(6);
       //  var result=  ll.addToPosition(88,3);
     // var cc=  ll.removeNthFromEnd(result,1);
        LinkedList l1Link= new LinkedList();
        ListNode l1= new ListNode();
        l1=l1Link.addToBeginning(9);
        l1=l1Link.addToTheEnd(9);
        l1=l1Link.addToTheEnd(9);
        l1=l1Link.addToTheEnd(9);
        l1=l1Link.addToTheEnd(9);
        l1=l1Link.addToTheEnd(9);
        l1=l1Link.addToTheEnd(9);
        LinkedList l2Link= new LinkedList();
        ListNode l2= new ListNode(5);
        l2=l2Link.addToBeginning(9);
        l2=l2Link.addToTheEnd(9);
        l2=l2Link.addToTheEnd(9);
        l2=l2Link.addToTheEnd(9);

        //AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    //    addTwoNumbers.addTwoNumbers(l1,l2);

        //MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();
      //  int[]nums1=new int[]{1,2};
      //  int[]nums2=new int[]{3,4};
     //var xx=   medianOfTwoSortedArray.findMedianSortedArrays(nums1,nums2);
      // var cc=xx;
        //ReverseInteger reverseInteger = new ReverseInteger();
       // reverseInteger.ReverseInteger(
       //         1534236469);
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        productOfArrayExceptSelf.productExceptSelf(new int[]{4,5,1,8,2});
        Atoi  atoi = new Atoi();
        atoi.myAtoi(
                "");

    }
}


