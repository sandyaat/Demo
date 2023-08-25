package org.example.creationaldesignpattern;

public class Singleton {
    public static Singleton singletonInstance;
    private Singleton(){

    }
    public Singleton getInstance(){
        if(singletonInstance==null){
           synchronized (this){
               if(singletonInstance==null)
                   singletonInstance=new Singleton();
           }
        }
        return singletonInstance;
    }
}
