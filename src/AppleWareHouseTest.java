import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

}