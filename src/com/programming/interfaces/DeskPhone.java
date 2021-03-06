package com.programming.interfaces;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {

        System.out.println("No action taken, desk phone does not have a powerButton.");

    }

    @Override
    public void dial(int phoneNumber) {

        System.out.println("Now Ringing " + phoneNumber + "On deskPhone");

    }

    @Override
    public void answer() {

        if (isRinging){

            System.out.println("answering the deskphone.");
            isRinging = false;

        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber){

            isRinging = true;
            System.out.println("Ring ring..");

        }else {

            isRinging = false;

        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
