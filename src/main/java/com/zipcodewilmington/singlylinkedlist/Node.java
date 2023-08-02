package com.zipcodewilmington.singlylinkedlist;



public class Node<T> {

    private T data;

    //pointer to next
    private Node<T> next;

    public Node(T data, Node<T> next) {

        this.data = data;
        this.next = next;
    }

    //creating a node that just is null
    public Node(T data) {
     //here we call constructor from above and set next to null
    this(data, null);


//        this.data = data;
//        this.next = null;
    }

    public T getData() { return data; }


    public boolean hasNext() {
        return this.next != null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node newnode) {
        this.next = newnode;
    }

}