package com.company;

import java.util.Scanner;

interface FlowersBed{
    String be();
}
public class Main {
    public static void main(String[] args) {

        class Beds{
            protected int countWater = 0;
            public String water() throws Exception {

                if (countWater == 4)
                    throw new SoMuch();
                ++countWater;
                return "налили ещё";
            }

            protected final String name = "Грядки";
            public String end(){
                return name + " кончились";
            }
        }
        Jet jet = new Jet();
        Shorties shorties = new Shorties();
        Shorties.OneShorty oneShorty = new Shorties.OneShorty();
        Shorties.TwoShorties twoShorties = new Shorties.TwoShorties();
        Shorties.ThreeShorties threeShorties = new Shorties.ThreeShorties();
        Shorties.ThirdShorty thirdShorty = new Shorties.ThirdShorty();
        Shorties.SomeShorty someShorty = new Shorties.SomeShorty();
        Beds beds = new Beds();
        Dunno dunno = new Dunno();
        Fiks fiks = new Fiks();
        Flowers aster = new Flowers("Астры");
        Flowers lilac = new Flowers("Сирень");
        Flowers reseda = new Flowers("Резеды");
        Flowers daisies = new Flowers("Лунные маргаритки");
        House house = new House();

        FlowersBed flowersBed = new FlowersBed() {
            @Override
            public String be() {
                return "Looooooool";
            }
        };

        FlowersBed newBed = () -> {
            return "Вокруг дома были разбиты клумбы с цветами";
        };

        System.out.println(threeShorties.water());
        try {

            System.out.println(beds.water());
            System.out.println(beds.water());
            System.out.println(beds.water());
            System.out.println(beds.water());
            System.out.println(beds.water());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(twoShorties.pump());
        System.out.println(thirdShorty.guide());
        System.out.println(jet.wakeUp());
        System.out.println(jet.spill());
        System.out.println(jet.drop());
        System.out.println(beds.end());
        System.out.println(someShorty.crawl());
        System.out.println(someShorty.collect(Berries.STRAWBERRY));

        System.out.println("Сколько корзин для ягод?");
        Scanner basketCounter = new Scanner(System.in);
        int basketCount = basketCounter.nextInt();
        System.out.println("Сколько ягод собрали?");
        Scanner berryCounter = new Scanner(System.in);
        int berryCount = berryCounter.nextInt();
        try {
            System.out.println(someShorty.put(basketCount, berryCount));
        }
        catch (RuntimeException exception){
            System.out.println(exception.toString());
        }


        System.out.println(oneShorty.see(dunno,fiks));
        System.out.println(oneShorty.scream());
        System.out.println(shorties.work());
        System.out.println(fiks.poke(dunno));
        System.out.println(fiks.go());
        System.out.println(dunno.go());
        System.out.println(dunno.up());
        System.out.println(dunno.see(house));
        System.out.println(newBed.be());
        System.out.println(aster.grow());
        System.out.println(lilac.grow());
        System.out.println(reseda.grow());
        System.out.println(daisies.grow());
        System.out.println(dunno.getUsed());
        System.out.println(dunno.beSurprised());


    }
}
