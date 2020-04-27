package playground;

import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arrays {
    public static <T> T[] newArray(int size, IntFunction<T> function, IntFunction<T[]> supplier) {
        T[] result = supplier.apply(size);
        for (int i = 0; i < result.length; i++) {
            result[i] = function.apply(i);
        }
        return result;
    }

    public static void main(String... args) {
        String[] letters = newArray(26,
                i -> "" + (char) ('a' + i),
                String[]::new);
        System.out.println(Stream.of(letters).collect(Collectors.joining()));
    }
}
