import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightAppleSearchCriteriaTest {

    LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();
    @Test
    void shouldSucceed() {
        Apple apple = new Apple("red", 100);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldFail(){
        Apple apple = new Apple("red", 200);
        assertFalse(criteria.test(apple));
    }
}