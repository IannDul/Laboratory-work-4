package com.company;

enum Berries{
    STRAWBERRY, RASPBERRY
}
public class Shorties {
    static String name = "Коротышки";

    public String work() {
        return name + " молча принялись за работу";
    }


    protected static class ThreeShorties {
         String name = "Трое коротышек";

         public String water() {
             return name + " производили поливку грядок";
         }
    }

    protected static class TwoShorties{
        String name = "Двое коротышек";
        public String pump() {
            return name + " качали воду насосом вручную";
        }

    }
    protected static class ThirdShorty{
        String name = "Третий коротышка";
        public String guide() {
            return name + " направлял из брандспойта струю";
        }
    }
    protected static class SomeShorty{
        String name = "Несколько коротышек";

        public String crawl() {
            return name + " ползали среди грядок";
        }
        public String decision() {
            return name + " решили не нести ягоды в руках и выкинули их все";
        }
        public String collect(Berries berries) {
            if (berries == Berries.STRAWBERRY){
                return name + " собирали клубнику";
            }
            else{
                return name + " собирали малинку";
            }
        }

        public String put(int basket, int berries) {
            if (basket == 0)
                throw new NoBasketException();
            return name + " складывали по " + berries/basket + " ягод в каждую из " + basket +  " круглых плетёных корзин";
        }
    }
    protected static class OneShorty{
        String name = "Один из работавших коротышек";
        public String see(Dunno dunno, Fiks fiks) {
            return name + " увидел " + dunno.name + " и " + fiks.name;
        }
        public String scream() {
            return name + " закричал";
        }
    }

}
