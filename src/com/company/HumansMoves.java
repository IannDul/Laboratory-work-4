package com.company;

public interface HumansMoves {
    String go();
    String up();
}

class Dunno implements HumansMoves{
    protected String name;

    {
        name = "Незнайка";
    }

    @Override
    public String go(){
        return name + " отправился дальше";
    }

    @Override
    public String up(){
        return name + " поднялся на холм";

    }

    public String see(House house){
//        return name + " увидел красивый двухэтажный дом с большой открытой верандой";
        return name + " увидел " + house.message();
    }
    public String getUsed(){
        return name + " уже начал привыкать к тому, что на Луне растения маленькие";
    }
    public String beSurprised(){
        return name + " не удивлялся этому";
    }

}

class Fiks implements HumansMoves{
    protected String name;

    {
        name = "Фикс";
    }

    @Override
    public String go(){
        return name + " отправился дальше";
    }

    @Override
    public String up(){
        return name + " поднялся на холм";

    }

    public String poke(Dunno dunno){
        return name + " ткнул палкой " + dunno.name;
    }
}

