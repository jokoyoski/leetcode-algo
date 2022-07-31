package com.company.lesson;

import java.util.*;
import java.io.*;

public class Scarmble {

    public static Boolean Operate(String str1 , String str2){
        Map<String,Boolean> mapper= new HashMap<>();
        Boolean mark=false;
        Boolean vA=false;
        Boolean vB=false;
        if(str1.length()<=1){
            return false;
        }
        if(str1.equals(str2)){
            return true;
        }

        String item=str1+" "+str2;
        if(mapper.containsKey(item)){
            return mapper.get(item);
        }
        Integer k= str1.length();

        for(Integer i=1;i<=k;i++){
            vA=(Operate(str1.substring(0,i),str2.substring(k-1,k)) && Operate(str1.substring(i,k),str2.substring(0,k-1)));
            vB=(Operate(str1.substring(0,i),str2.substring(0,i)) && Operate(str1.substring(i,k),str2.substring(i,k)));

            if(vA ||vB){
                mark=true;
                break;

            }


        }
        mapper.put(item,mark);
        return mark;
    }

    public static String StringScramble(String str1, String str2) {

        if(str1.length()!=str2.length()){
            return "false";
        }


        // code goes here
        var result= Operate(str1,str2);
        System.out.print(result.toString());
        return result.toString();
    }

}