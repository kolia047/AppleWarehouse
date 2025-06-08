import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeavyAppleSearchCriteriaTest {

    HeavyAppleSearchCriteria criteria = new HeavyAppleSearchCriteria();
    @Test
    void shouldSucced() {
        Apple apple = new Apple("red", 200);
        assertTrue(criteria.test(apple));
    }
    @Test
    void shouldFails(){
        Apple apple = new Apple("red", 100);
        assertFalse(criteria.test(apple));
    }
}