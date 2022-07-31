package com.company.lesson;

public class Palidrome {

    public static  String GetPalidrome(String str){
        if(str.length()==1)
        {
            return "true";
        }
        char[] letterArray=str.toCharArray();
        Boolean isPalidrome=true;
        StringBuilder st1= new StringBuilder();
        StringBuilder st2= new StringBuilder();

       // char [] reverseArray=str.toCharArray().

        for(int i=0;i<= letterArray.length-1;i++){
            if(!Character.isWhitespace(letterArray[i])){
                st1.append(letterArray[i]);
            }

        }
        for(int i=letterArray.length-1;i>=0;i--){
            if(!Character.isWhitespace(letterArray[i])){
                st2.append(letterArray[i]);
            }
        }
        char[] fowardArray=st1.toString().toCharArray();
       char [] reverseArray=st2.toString().toCharArray();

        for(int i=0;i<fowardArray.length;i++){
            var a=fowardArray[i];
            var inverse=reverseArray[i];
            if(fowardArray[i]!=reverseArray[i]){
                isPalidrome=false;
            }
        }

        if(isPalidrome){
            return "true";
        }
        return "false";
    }
}
