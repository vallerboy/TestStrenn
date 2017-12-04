package lambdas;

import java.io.IOException;
import java.util.Calendar;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class Calculator {
    public static void main(String[] args) {



        System.out.println(operateBinary(5, 5, (a,b) -> a + b));
        System.out.println(operateBinary(5, 5, (a,b) -> {
            if(b == 0){
                throw  new ArithmeticException();
            }
            return a / b;
        }));
    }

    public static int operateBinary(int a, int b, IntBinaryOperator inter){
        return inter.applyAsInt(a, b);
    }
}
