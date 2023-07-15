package com.company.lesson;

public class ReverseInteger {

    public Integer ReverseInteger(int x ){

        if(x>= Integer.MAX_VALUE || x<=Integer.MIN_VALUE)
            return 0;
        int reverse=0; int remainder=0;
         while(x!=0){
             remainder =  x%10;
             reverse= reverse *10 +x % 10;
             x=x/10;
             if(reverse >= Integer.MAX_VALUE){
                  return 0;
             }

         }

          return reverse;
    }
}
//-231 <= x <= 231 - 1