package com.company.lesson;

public class Factory  {


    public int GetFactory(Integer[] values){
        int totalCount=0;
        if(values.length==0){
            return 0;
        }

        for(var i =0;i<values.length;i++){
            totalCount+=values[i];
        }

        var value= totalCount/2/2;
        return value;
    }



    'id'    'user_id', 'amount'
     1       4          4000
     3     5            2000
     5      7          3000


            'select top 2 from salary order by amount  desc into temp_table';

            'select top 1 from temp_table order by anmount  asc'



/*
Given pollution amount in terms of integers. Count mini. no. of filters required to reduce total pollution by at-least half. One filter reduces pollution by half. and if you put another filter in same factory it will be 4th (N/2/2)

Example: N =[5,19,8,1]
totalPollution = 5+19+8+1=33
numberOfFiltersRequire =3

Example: N =[3,0,5]
totalPollution = 3+0+5=8
numberOfFiltersRequire =2
 */
}
