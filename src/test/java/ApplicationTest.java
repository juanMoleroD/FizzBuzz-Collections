import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApplicationTest {

    Application app = new Application();

    @Test
    void fizzOn3() {
        assertEquals(List.of(1,2,"Fizz"), app.fizzbuzz(3));
    }

    @Test
    void BuzzOn5() {
        assertEquals(List.of(1,2,"Fizz",4,"Buzz"), app.fizzbuzz(5));
    }
}