package com.company.lesson;

public class LongestWord {

    public static String LongestWord(String sen) {
        Integer currentMax=0;
        Integer miniCount=0;
        String letters="abcdefghijklmnopqrstuvwxyz";

        for(char item : sen.toCharArray()){
            System.out.print(item );
            if(Character.isDigit(item) ||Character.isLetter(item)){
                System.out.print("It is a letter enter ");
                miniCount++;
            }
            if(Character.isWhitespace(item)){
                System.out.print("It is a white space...end of statment... ");
                if(miniCount>currentMax){
                    currentMax=miniCount;
                    miniCount=0;
                }
            }
        }
        if(miniCount>currentMax){
            currentMax=miniCount;
            miniCount=0;
        }

        System.out.print(currentMax);
        //String
        // code goes here
        return sen;
    }

}
