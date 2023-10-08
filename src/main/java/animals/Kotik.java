package animals;

import java.util.Random;

public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private double weight;
    private static int count = 0;
    private static final int METHODS = 5;
    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    public String getName() {
        return name;
    }
    public String getVoice() {
        return voice;
    }
    public int getSatiety() {
        return satiety;
    }
    public double getWeight() {
        return weight;
    }
    public static int getCount() {
        return count;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean play() {
        if (satiety > 0) {
            System.out.println(name + " играет.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " просит есть.");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println(name + " спит.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " просит есть.");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            System.out.println(name + " умывается.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " просит есть.");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println(name + " гуляет.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " просит есть.");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println(name + " охотится.");
            satiety--;
            return true;
        } else {
            System.out.println(name + " просит есть.");
            return false;
        }
    }
    public static void liveAnotherDay(Kotik kotik) {
        String[] activities = new String[24];
        Random random = new Random();
        String actions = null;

        for (int hour = 0; hour < 24; hour++) {
            int action = random.nextInt(METHODS) + 1;
            switch (action) {
                case 1:
                    if (!kotik.play()) {
                        kotik.eat(random.nextInt(4) + 1);
                    }
                    else actions = "играет";
                    break;
                case 2:
                    if (!kotik.sleep()) {
                        kotik.eat(random.nextInt(4) + 1);
                    }
                    else actions = "спит";
                    break;
                case 3:
                    if (!kotik.wash()) {
                        kotik.eat(random.nextInt(4) + 1);
                    }
                    else actions = "купается";
                    break;
                case 4:
                    if (!kotik.walk()) {
                        kotik.eat(random.nextInt(4) + 1);
                    }
                    else actions = "гуляет";
                    break;
                case 5:
                    if (!kotik.hunt()) {
                        kotik.eat(random.nextInt(4) + 1);
                    }
                    else actions = "охотиться";
                    break;
            }
            activities[hour] = hour + " - " + actions;
        }

        for (String activity : activities) {
            System.out.println(activity);
        }
    }
    public void eat(int satietyIncrease, String food) {
        System.out.println(name + " ест " + food + " и становится сытым.");
        satiety += satietyIncrease;
    }
    public void eat(int satietyIncrease) {
        System.out.println(name + " ест и становится сытым.");
        satiety += satietyIncrease;
    }

    public void eat() {
        Random random = new Random();
        int food = random.nextInt(4) + 1;

        switch (food) {
            case 1:
                eat(3, "рыбу");
                break;
            case 2:
                eat(1, "корм");
                break;
            case 3:
                eat(2, "паштет");
                break;
            case 4:
                eat(3, "курицу");
                break;
        }
    }

    public boolean compareVoice(Kotik otherKotik) {
        return this.voice.equals(otherKotik.getVoice());
    }
}
