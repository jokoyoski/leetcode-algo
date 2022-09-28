package com.company;

import com.company.lesson.*;

public class Main {

    public static void main(String[] args) {
       // PushDominos pushDominos = new PushDominos();
        //pushDominos.pushDominoes(".L.R...LR..L..");
        LinkedList ll= new LinkedList();
        LinkedList.LinkNode node = ll.addToBeginning(4);
        node=ll.addToBeginning(3);
        ll.addToBeginning(2);
        ll.addToBeginning(1);
        ll.addToTheEnd(5);
      var result=  ll.addToTheEnd(6);
       //  var result=  ll.addToPosition(88,3);
      var cc=  ll.removeNthFromEnd(result,1);

      var mm=cc;
    }
}


