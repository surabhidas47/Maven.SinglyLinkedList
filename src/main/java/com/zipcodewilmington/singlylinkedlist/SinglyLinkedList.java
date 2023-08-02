package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList <T> implements LinkedListIface{




    private Node <T> head = null;

    //adding this bc a common method for collections
    public Boolean isEmpty(){
        return head == null;
    }
    public SinglyLinkedList(){

    }


    @Override
    public void add(Object data) {
        //adding a new NODE
        //dont have a next, not worried abt that rn
        //when we add, it goes to the end of the list so we need to start at the beginning and loop thru until we
        //find the null and attach it there
        Node newnode = new Node(data);
        if(this.head == null){
            this.head = newnode;
        }
        else{
            Node<T> temp = head;
            while(temp.hasNext()){ // walk to end
                temp = temp.getNext();
            }
            temp.setNext(newnode);
        }

    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        //add the head
        sb.append("head -> ");

        //looping thru the list and printing out.. copied this from above
       if (head!=null){
           Node<T> temp = head;
          do{
               //print the data if there is a next

               //want to print out the data inside the object
               sb.append("[" +temp.getData()+"] -> ");

               temp = temp.getNext();

               //if temp is equal to null it doensnt have next so we added (temp != null)
             } while((temp != null));//

           // && temp.hasNext());
           //if temp is null we dont need has next

        }

        // at the bottom add the null
        sb.append("NULL");

        return sb.toString();
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean contains(Object data) {
        return false;
    }

    @Override
    public int find(Object data) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }
}
