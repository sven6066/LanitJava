import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kot1 = new Kotik("Барсик", "Мяу", 10, 5.0);
        Kotik kot2 = new Kotik();
        kot2.setName("Мурзик");
        kot2.setVoice("Мяу-мяу");
        kot2.setSatiety(8);
        kot2.setWeight(4.5);

        Kotik.liveAnotherDay(kot1);

        System.out.println("Имя котика: " + kot1.getName());
        System.out.println("Вес котика: " + kot1.getWeight());

        System.out.println("Имя котика: " + kot1.getName());
        System.out.println("сытость: "+ kot2.getSatiety());
        kot2.eat();
        System.out.println("сытость: "+ kot2.getSatiety());

        boolean voicesEqual = compareVoice(kot1, kot2);
        System.out.println("Котики разговаривают одинаково: " + voicesEqual);

        System.out.println("Количество созданных котиков: " + Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kot1, Kotik kot2) {
        return kot1.compareVoice(kot2);
    }
}
