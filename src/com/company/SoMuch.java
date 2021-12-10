package com.company;

public class SoMuch extends Exception{

    public String toString() {
        return "Перелили грядку";
    }
}

class NoBasketException extends RuntimeException{
    public String toString() {
        return "Коротышки решили не нести ягоды в руках и выкинули их все";
    }
}
