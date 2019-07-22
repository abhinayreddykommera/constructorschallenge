package com.abhi;

/**
 * Created by abhinayreddy on 3/15/2017.
 */
public class Vipcustomer {
    private String name;
    private int creditlimit;
    private String email;

    public Vipcustomer(){
        this("bob",250,"bob@email.com");
        System.out.println("Empty Constructor called");
    }

    public Vipcustomer (String name, int creditlimit, String email){
        System.out.println("Vipcustomer constructor with parameters called");
        this.name=name;
        this.creditlimit=creditlimit;
        this.email=email;
    }

    public Vipcustomer(String email){
        this("Tim", 300, email);


    }

    public String getName() {
        return name;
    }

    public int getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}