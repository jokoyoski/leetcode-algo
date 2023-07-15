package com.company.lesson;

import java.util.*;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> numsList = new ArrayList<Integer>();
        double result=0;

        for (int b : nums1) {
            numsList.add(b);
        }

        for (int b : nums2) {
            numsList.add(b);
        }
        Collections.sort(numsList);

        if(numsList.size()%2>0){
           return  result= numsList.get(numsList.size()/2);
        }
        int bb=numsList.size()/2;

        int value1=numsList.get(bb-1);
        int value2=numsList.get(bb);

         result=value1 +value2;
        return result/2;
    }

}
