package com.programming.interfaces;

public class Main {

    public static void main(String[] args) {
        //DeskPhone.
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        System.out.println("*********************");
        //MobilePhone.
        timsPhone = new MobilePhone(123456789);
        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();



    }
}
