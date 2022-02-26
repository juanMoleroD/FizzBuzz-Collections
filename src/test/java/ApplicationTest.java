import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ApplicationTest {

    @Test
    void appAcceptsInt() {
        Application app = new Application();
        app.fizzbuzz(100);
        assertEquals(List.of(1,2,"Fizz"), app.fizzbuzz(3));
    }

}