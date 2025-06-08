import java.util.ArrayList;
import java.util.List;

public class AppleWareHouse {
    private List<Apple> apples = getAllApples();

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a : apples) {
            if (a.getColor().equals("green")) {
                greenApples.add(a);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a : apples) {
            if (a.getColor().equals("red")) {
                greenApples.add(a);
            }
        }
        return greenApples;
    }

    public List<Apple> findApples(String color) {
        List<Apple> apples = new ArrayList<>();
        for (Apple a : this.apples) {
            if (color.equals(a.getColor())) {
                apples.add(a);
            }
        }
        return apples;
    }

    public List<Apple> findHeavyApples(int weight) {
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple a : apples) {
            if (a.getWeight() > weight) {
                heavyApples.add(a);
            }
        }
        return heavyApples;
    }
}
