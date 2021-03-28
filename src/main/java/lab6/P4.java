package lab6;

import java.util.stream.IntStream;

import static java.lang.Math.*;

public class P4 {
    public P4(int number) {
        IntStream.rangeClosed(0, number)
                .filter(num -> {
                    var numOfDigits = (int) ceil(log10(num));
                    var msbMask = max((int) pow(10, numOfDigits - 1), 1);
                    var newNum = num;
                    while (newNum != 0) {
                        if (newNum % 10 != newNum / msbMask) {
                            return false;
                        }
                        newNum %= msbMask;
                        newNum /= 10;
                        msbMask /= 100;
                    }
                    return true;
                }).forEach(System.out::println);
    }

    public static void main(String[] args) {
        var p4 = new P4(1000);
    }
}
