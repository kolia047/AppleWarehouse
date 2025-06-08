import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenAppleSearchCriteriaTest {

    private GreenAppleSearchCriteria criteria = new GreenAppleSearchCriteria();

    @Test
    void shouldSucceed() {
        Apple apple = new Apple("green", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldFail(){
        Apple apple = new Apple("red", 200);
        assertFalse(criteria.test(apple));
    }
}