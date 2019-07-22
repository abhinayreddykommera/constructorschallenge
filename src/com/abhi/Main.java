package com.abhi;

public class Main {

    public static void main(String[] args) {
        Vipcustomer tim = new Vipcustomer("tim@email.com");
        System.out.println(tim.getEmail() + " name " + tim.getName() );

        Vipcustomer bob = new Vipcustomer();
        System.out.println( " name is " + bob.getName() + " and the credit limit is " + bob.getCreditlimit());


    }


}
