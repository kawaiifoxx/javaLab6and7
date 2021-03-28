package lab6;

import java.math.BigDecimal;

public class P1 {
    int number;
    BigDecimal factorial;

    public P1(int number) {
        this.number = number;
    }

    public BigDecimal getFactorial() {
        if (factorial == null) {
            factorial = new BigDecimal(1);
            BigDecimal num = new BigDecimal(number + 1);
            while (num.intValue() > 1) factorial = factorial.multiply(num = num.subtract(BigDecimal.ONE));
        }
        return factorial;
    }

    public static void main(String[] args) {
        var p1 = new P1(100);
        var p2 = new P1(200);
        var p3 = new P1(300);
        var p4 = new P1(400);
        var p5 = new P1(500);
        System.out.println(p1.getFactorial().toBigIntegerExact());
        System.out.println(p2.getFactorial().toBigIntegerExact());
        System.out.println(p3.getFactorial().toBigIntegerExact());
        System.out.println(p4.getFactorial().toBigIntegerExact());
        System.out.println(p5.getFactorial().toBigIntegerExact());
    }
}
