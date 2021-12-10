package com.company;

public class House {
    protected String name = "Дом";
    protected String size = "двухэтажный";
    protected String emotions = "Ух сука какой";

    public String message() {
        return veranda.msg();
    }
    Veranda veranda = new Veranda();

    protected class Veranda{
        protected String name = "веранда";
        protected String size = "большая";
        private String msg(){
            return House.this.emotions + ' ' + House.this.size + ' ' + House.this.name + " c " + size + ' ' + name;
        }
    }
}