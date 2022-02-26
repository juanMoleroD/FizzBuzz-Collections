import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    Application app = new Application();
    List<String> testList = app.fizzbuzz(100);

    @Test
    void fizzOn3() {
        assertEquals("Fizz", testList.get(5));
        assertEquals("Fizz", testList.get(8));
        assertEquals("Fizz", testList.get(11));
        assertEquals("Fizz", testList.get(32));
        assertEquals("Fizz", testList.get(65));
        assertEquals("Fizz", testList.get(83));
        assertEquals("Fizz", testList.get(98));
    }

    @Test
    void BuzzOn5() {
        assertEquals("Buzz", testList.get(4));
        assertEquals("Buzz", testList.get(9));
        assertEquals("Buzz", testList.get(19));
        assertEquals("Buzz", testList.get(24));
        assertEquals("Buzz", testList.get(49));
        assertEquals("Buzz", testList.get(84));
        assertEquals("Buzz", testList.get(99));
    }

    @Test
    void FizzBuzzOnMultiplesOf3And5() {
        assertEquals("FizzBuzz", testList.get(14));
        assertEquals("FizzBuzz", testList.get(29));
        assertEquals("FizzBuzz", testList.get(44));
        assertEquals("FizzBuzz", testList.get(59));
        assertEquals("FizzBuzz", testList.get(74));
        assertEquals("FizzBuzz", testList.get(89));
    }
}