package com.example.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired   // This is a field injection
    private Computer comp;

//    public Dev(Laptop laptop){  // This is also called constructor injection // Does not need Autowired
//        this.laptop = laptop;
//    }


   @Qualifier() // if we don't want to use @Primary then we can use it @Qualifier("Name of the instance")in this case ie. com

    public void build(){
        comp.compile();
         System.out.println("Working on first project");
         System.out.println("Working on first project");
         System.out.println("Working on first project");

    }
}
