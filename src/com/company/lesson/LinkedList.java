package com.company.lesson;

public class LinkedList {

   ListNode node;
    public ListNode addToBeginning(int value){
        var node_value=new ListNode(value);
        node_value.next=this.node;
       this.node= node_value;
       return this.node;
    }

    public ListNode addToTheEnd(int value){
        ListNode nodeV=new ListNode();
        var node_value=new ListNode(value);
        nodeV=this.node;
        while(nodeV.next!=null){
            nodeV=nodeV.next;
        }
        nodeV.next=node_value;
        return this.node;
    }

    public int count(ListNode node){
        if(node==null){
            return 0;
        }
        ListNode temp=node;
        int counter=1;
         while(temp.next!=null){
             counter++;
             temp=temp.next;
         }
         return counter;
    }

    public ListNode addToPosition(int value, int position){
        int internal_position=0;
        ListNode nodeV=new ListNode();
        var node_value=new ListNode(value);
        nodeV=this.node;
        while(internal_position+2<position){
            nodeV=nodeV.next;
            internal_position++;
        }
        var before=nodeV;
        var after_next=nodeV.next;
        before.next=node_value;
        node_value.next=after_next;
        nodeV.next=node_value;
        return this.node;
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        int internal_position=0;
        int counter=this.count(head);
        ListNode nodeV=head;
        var position=counter-n+1;   // total count minus the position +1 will give us our section
        if(counter<n){
            //return 0;
        }
        while(internal_position+2<position){
            nodeV=nodeV.next;
            internal_position++;
        }
        if(position==1){
            nodeV=nodeV.next;
            this.node=nodeV;
            return this.node;
        }
        var before=nodeV;
        var after_next=nodeV.next.next;
        before.next=after_next;
        this.node=this.node;

       return this.node;
    }

}
