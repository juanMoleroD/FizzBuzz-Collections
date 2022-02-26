import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {



    public List<String> fizzbuzz(int countLimit) {

        return IntStream.rangeClosed(1, countLimit)
                .mapToObj(this::fizzBuzzMappingLogic)
                .collect(Collectors.toList());
    }

    private String fizzBuzzMappingLogic(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);

    }
}
