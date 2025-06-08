import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWareHouseTest {
    @Test
    void findGreenApplesTest() {
        AppleWareHouse wareHouse = new AppleWareHouse();
        List<Apple> greenAples = wareHouse.findGreenApples();
        assertEquals(greenAples.size(), 3);
    }

    @Test
    void findRedApplesTest() {
        AppleWareHouse wareHouse = new AppleWareHouse();
        List<Apple> redAples = wareHouse.findRedApples();
        assertEquals(redAples.size(), 3);

    }

    @Test
    void findApples(){
        AppleWareHouse wareHouse = new AppleWareHouse();
        List<Apple> apples = wareHouse.findApplesColor("yellow");
        assertEquals(apples.size(), 2);
    }

    @Test
    void findHeavyApplesTest(){
        AppleWareHouse wareHouse = new AppleWareHouse();
        List<Apple> heavyApples = wareHouse.findHeavyApples(150);
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingSearchCriteria() {
        AppleWareHouse wareHouse = new AppleWareHouse();
        List<Apple> greenApples = wareHouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = wareHouse.findApples(new RedAppleSearchCriteria());
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = wareHouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesLightThen150 = wareHouse.findApples(new LightAppleSearchCriteria());
        assertEquals(applesLightThen150.size(), 4);
    }

}