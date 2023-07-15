package com.company.onehundreddaysleetcode;

public class ProductOfArrayExceptSelf {
    /*
      In this solution we were able to solve it by having two arrays arr1 and arr2
      arr1=> will be the prefix array (from left)

      arr2=> will be the prefix array (from right)

      The first element of arr1 will be 1 by default and then we proceed by iterating over the the original array starting from the second index and
      multiplying the previous index of the original array with previous index of the arr1



     */
    public int[] productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] postFixArray = new int[nums.length];
        int[] finalOutput = new int[nums.length];
        int prevLastValue = 1;
        int postLastValue = 1;
        prefixArray[0] = 1;
        postFixArray[nums.length -1] =1;

        //set up prefix
        for(var i =1; i < nums.length; i++){
            prevLastValue = prefixArray[i -1] * nums[i -1];
            prefixArray[i] = prevLastValue;
        }
        for(var i = nums.length - 2 ; i >=0; i--){
            var b =i;
            postLastValue = postFixArray[i + 1] * nums[i + 1];
            postFixArray[i] = postLastValue;
        }

        for(var i =0;i< nums.length; i++){
            finalOutput[i] =  prefixArray[i] * postFixArray[i];
        }

        return finalOutput;
    }

}
