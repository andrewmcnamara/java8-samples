import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(99, 22, 44, 11, 10, 1);

        System.out.println(numbers.stream().max((p1, p2) -> p1 - p2).get());

    }
}
