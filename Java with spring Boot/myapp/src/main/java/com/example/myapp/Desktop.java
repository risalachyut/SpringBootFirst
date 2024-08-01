package com.example.myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// if both sub interfaces have component then in order to tell compiler which to run then we use @Primary for output we want.
@Component
@Primary // no need after using qualifier
public class Desktop implements Computer  {
    public void compile(){
        System.out.println("Compiling with 404 bugs but faster");
    }



}
