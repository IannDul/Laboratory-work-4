package com.company;

public class Flowers {
    public Flowers (String sort){
        this.sort = sort;
    }
    protected String sort;
    public String grow(){
        return sort + " росли";
    }
}

