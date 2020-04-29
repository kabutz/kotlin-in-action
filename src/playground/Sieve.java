package playground;

import playground.util.Benchmark;

import java.util.stream.IntStream;

public class Sieve {
    public static void main(String... args) {
        for (int i = 0; i < 10; i++) sumWithIntStream();
        var bm = new Benchmark();
        bm.start();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) sum = sumWithIntStream();
        bm.stop();
        System.out.println("sum = " + sum);
        System.out.println("bm = " + bm);

        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private static int sumWithIntStream() {
        return IntStream.rangeClosed(1, 1000)
                    .filter(i -> i % 2 != 0)
                    .filter(i -> i % 3 != 0)
                    .filter(i -> i % 5 != 0)
                    .filter(i -> i % 7 != 0)
                    .sum();
    }
}
