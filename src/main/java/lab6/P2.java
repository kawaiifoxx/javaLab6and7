package lab6;

import java.util.stream.IntStream;

import static java.lang.Math.pow;
import static java.util.Arrays.stream;

public class P2 {

    void displayArmstrongNumbers(int number) {
        IntStream.rangeClosed(0, number)
                .filter(num -> stream(Integer.toString(num)
                                .split(""))
                                .mapToInt(digit -> (int) pow(Integer.parseInt(digit), 3))
                                .sum() == num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        var p2 = new P2();
        p2.displayArmstrongNumbers(555);
    }
}
