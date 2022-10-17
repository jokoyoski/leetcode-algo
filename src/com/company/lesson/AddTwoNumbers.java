package com.company.lesson;

public class AddTwoNumbers {


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode finalNode=null;
            int modl1Andl2=0;
            int divl1Andl2=0;
            int l1Node=0;
            int l2Node=0;
            //calculat l1 and l2
            while (l1!= null || l2 !=null || divl1Andl2 !=0 ){
                if(l1==null){
                    l1Node=0;
                }else{
                    l1Node=l1.val;
                }
                if(l2==null){
                    l2Node=0;
                }else{
                    l2Node=l2.val;
                }


                int l1Andl2= l1Node + l2Node + divl1Andl2;
                modl1Andl2=l1Andl2%10;
                divl1Andl2=l1Andl2/10;
                if(finalNode==null){
                    finalNode= new ListNode(modl1Andl2);
                }else{
                    ListNode temp=finalNode;
                    while(temp.next!=null){
                        var dd=temp;
                        temp=temp.next;
                    }

                    temp.next= new ListNode(modl1Andl2);
                }
                if(l1!=null){
                    if(l1.next!=null){
                        l1=l1.next;
                    }else{
                        l1=null;
                    }
                }

               if(l2!=null){
                   if(l2.next!=null){
                       l2=l2.next;
                   }else{
                       l2=null;
                   }

               }

            }
            return finalNode;
        }

}
