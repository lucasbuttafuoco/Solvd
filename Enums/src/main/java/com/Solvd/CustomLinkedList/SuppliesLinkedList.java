package com.Solvd.CustomLinkedList;

import com.Solvd.HospitalApp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SuppliesLinkedList <Supplies>{

    private static final Logger LOGGER = LogManager.getLogger(SuppliesLinkedList.class);

    class Node {
        Supplies val;
        Node next;

        Node(Supplies val){
            this.val = val;
        }
    }

    private Node head;
    private Node tail;


    public void addFirst(Supplies val){ //add a value in the first node of the list
        if(isEmpty()){ //if the list is Empty, the only value is the one I0m adding, so tail = head
            head = new Node(val);
            tail = head;
            return;
        }

        Node newNode = new Node(val); //the list isnt empty so I'm adding the node and then change the value of head and pointing the next to the previous head value.
        newNode.next = head;
        head = newNode;

    }

    public void addLast(Supplies val){ //add a value in the last node
        if(isEmpty()){ //if the list is Empty, the only value is the one I0m adding, so tail = head
            head = new Node(val);
            tail = head;
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int pos, Supplies val){
        if(pos == 1) {
            addFirst(val);
            return;
        }

        Node current = head;
        int count = 1;
        while (count < pos-1){
            count++;
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }

    public Supplies deleteFirst(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }

        Node current = head;
        head = head.next;
        current.next = null;
        if(isEmpty()){
            tail = null;
        }
        return current.val;
    }

    public Supplies deleteLast(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        if( head == tail) { //it meands that the list has only one value, I might have a nullpointer exception if I dont consider this case.
            Supplies val = head.val;
            head = null;
            tail = null;
            return val;
        }

        Node current = head;
        Node previous = null;
        while(current != null ){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        tail = previous;
        return current.val;
    }

    public Supplies delete(int pos){ //delete a node at a given position
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }

        if( pos == 1){
            deleteFirst();
        }
        Node current = head;
        Node previous = null;
        int count = 1;

        while(count < pos){
            count++;
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
        current.next = null;
        return current.val;

    }

    public boolean search(Supplies val){ // search a value in the list
        Node current = head;
        while( current != null){
            if(val == current.val){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean isEmpty(){ //checks if the list is empty
        return head == null;
    }
    public void print(){ //shows de values of the list
        Node current = head;

        while(current != null){
            LOGGER.info(current.val + " ->");
            current = current.next;
        }

    }


}
