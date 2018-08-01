package model;

public class Child extends Father {

    public Child(){
        this("child有参");
        System.out.println("child无参后");
    }

    public Child(String a){
        System.out.println(a);
    }

    @Override
    public void fa(){
        System.out.println("ca");
    }

    public void cb(){
        System.out.println("cb");
    }
}
