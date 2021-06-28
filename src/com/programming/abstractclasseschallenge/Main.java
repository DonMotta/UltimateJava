package com.programming.abstractclasseschallenge;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());

        String stringData = "5 7 3 8 9 2 1 0 4 6 ";
        String[] data = stringData.split(" ");

        for (String s : data){

            list.addItem(new Node(s));

        }

        list.tranverse(list.getRoot());

    }
}
