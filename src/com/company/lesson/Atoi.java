package com.company.lesson;

import java.util.ArrayList;
import java.util.List;

public class Atoi {

    public int myAtoi(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        var xx=Integer.parseInt("-34");
        Character type = '%';
        Integer digit_value_string=0;
        String string_value="";
        int last_value=0;
        int last_index=0;
        boolean is_remove=false;
        // read whitespaces

        //check for characte + or - if non take as +
        //continue to read until next non digit
        //ignore anything after character
        //if no digit then 0
        //if integer is greater than max return max or less than min
        // remove the whitespaces first

        char[] s_char=s.toCharArray();

        for(var i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){

                is_remove=true;
            } else {
                last_index = i;
                i =  s.length();
            }
        }
        if(is_remove){
            s= s.substring(last_index);
            is_remove=false;
        }
        if(s.charAt(0)=='-'){
            type = '-';
            s=s.substring(1);
        }else if(s.charAt(0)=='+'){
            s=s.substring(1);
            type = '+';
        }else{
            type = '+';
        }


        for(var i=0;i< s.length();i++) {
            if(!Character.isDigit(s.charAt(i)))
            {
                i =  s.length();
            }else {
                string_value += s.charAt(i);
            }
        }
        if(string_value==""){
            return 0;
        }

        if(is_remove){
            if(last_index==0){
                last_index=1;
            }
            s= s.substring(last_index);
            is_remove=false;
        }
        try{
            last_value= Integer.parseInt(string_value);
        }catch(Exception ex){
            if(type!='-'){
                return Integer.MAX_VALUE;
            }else{
                return Integer.MIN_VALUE;
            }
        }



        if(type=='-'){
            last_value = 0 - last_value;
        }
        if(last_value > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(last_value < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return last_value;
    }
}
