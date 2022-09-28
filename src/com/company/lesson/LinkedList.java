package com.company.lesson;

public class LinkedList {
    public LinkNode node ;
    public class LinkNode {
        public LinkNode(int value){
            this.value=value;
            this.next=null;
        }
        public LinkNode(){

        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public LinkNode getNext() {
            return next;
        }

        public void setNext(LinkNode next) {
            this.next = next;
        }

        public int value;
        public LinkNode next;
    }


    public LinkNode addToBeginning(int value){
        var node_value=new LinkNode(value);
        node_value.next=this.node;
       this.node= node_value;
       return this.node;
    }

    public LinkNode addToTheEnd(int value){
        LinkNode nodeV=new LinkNode();
        var node_value=new LinkNode(value);
        nodeV=this.node;
        while(nodeV.next!=null){
            nodeV=nodeV.next;
        }
        nodeV.next=node_value;
        return this.node;
    }

    public int count(LinkNode node){
        if(node==null){
            return 0;
        }
        LinkNode temp=node;
        int counter=1;
         while(temp.next!=null){
             counter++;
             temp=temp.next;
         }
         return counter;
    }

    public LinkNode addToPosition(int value, int position){
        int internal_position=0;
        LinkNode nodeV=new LinkNode();
        var node_value=new LinkNode(value);
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


    public LinkNode removeNthFromEnd(LinkNode head, int n) {

        int internal_position=0;
        int counter=this.count(head);
        LinkNode nodeV=head;
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
