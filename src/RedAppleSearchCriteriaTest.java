import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedAppleSearchCriteriaTest {

    private RedAppleSearchCriteria criteria = new RedAppleSearchCriteria();
    @Test
    void shouldSucced() {
        Apple apple = new Apple("red", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    void shouldFail(){
        Apple apple = new Apple("green", 200);
        assertFalse(criteria.test(apple));
    }
}