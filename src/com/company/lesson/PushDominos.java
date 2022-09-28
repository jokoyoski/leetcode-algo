package com.company.lesson;

public class PushDominos {
    public String pushDominoes(String dominoes) {
        char[] dominosChar=dominoes.toCharArray();

             char two_left_item='0';
             char two_right_item='0';
             char one_right_item='0';
             boolean  unfallable=false;

          if (dominosChar.length>1 && dominosChar[1]=='L' && dominosChar[0]=='.'){
              dominosChar[0]='L';
          }

         for(int i=1;i<dominosChar.length;i++){
             if(i-2>=0){
                  two_left_item=dominosChar[i-2];
             }

             if(dominosChar.length -i>=3){
                 two_right_item=dominosChar[i+2];
             }

             if(dominosChar.length -i>=2){
                 one_right_item=dominosChar[i+1];
             }

             if(dominosChar[i-1]=='R' && dominosChar[i]=='.') {
              if(two_left_item =='R'){
                  dominosChar[i]=dominosChar[i];
                  unfallable=true;

              }else{

                  dominosChar[i]='R';
              }
             }
             if(unfallable){
                 if(one_right_item=='L' && dominosChar[i]=='.') {
                     if(two_right_item =='L'){
                         dominosChar[i]=dominosChar[i];
                     }{

                         dominosChar[i]='L';
                     }
                 }

             }

             unfallable=false;

        }
        var mm= String.valueOf(dominosChar);
        return mm;
    }
}
