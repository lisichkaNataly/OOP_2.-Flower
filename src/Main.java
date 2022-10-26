public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(null, "Голландия", 35.39);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.lifeSpan = 5;
        Flower pion = new Flower (null, "Англия", 69.9);
        pion.lifeSpan = 1;
        Flower gypsophila = new Flower(null, "Турция", 19.5);
        gypsophila.lifeSpan = 10;

        printIfo(rose);
        printIfo(chrysanthemum);
        printIfo(pion);
        printIfo(gypsophila);

        System.out.println();

        printCostOfFlowers(
                rose, rose,rose,
                chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila);
    }

    private static void printIfo(Flower flower) {
        System.out.println(
                "Цветок: " + flower.getFlowerColor() +
                        ", страна: " + flower.getCountry() +
                        ", стоимость за штуку: " + flower.getCost() +
                        ", срок стояния цветка: " + flower.lifeSpan);
    }

    private static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printIfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost + " рублей");
        System.out.println("Срок стояния букета: " + minimumLifeSpan + " дней");
    }
}