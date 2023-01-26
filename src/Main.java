import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isNumberMoreThenNull = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(isNumberMoreThenNull.test(2));
        System.out.println(isNumberMoreThenNull.test(-2));

        Predicate<Integer> isNumberMoreThenNull1 = integer -> integer > 0;
        System.out.println(isNumberMoreThenNull1.test(10));
        System.out.println(isNumberMoreThenNull1.test(-10));
        System.out.println("____________________________________-");


        Consumer<String> hello = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println( "Привет! " + s);
            }
        };
        hello.accept("Иван");

        Consumer<String> hello1 = s -> System.out.println( "Привет! " + s);
        hello1.accept("Николай");

        System.out.println("____________________________________-");

        Function <Double, Long> roundLong = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(roundLong.apply(16.84));
        Function<Double, Long> roundLong1 = aDouble -> Math.round(aDouble);
        System.out.println(roundLong1.apply(17.96));
        System.out.println("____________________________________-");


        Supplier <Integer> randomInteger = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };
        System.out.println(randomInteger.get());
        Supplier<Integer> randomInteger1 = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(randomInteger1.get());

    }

    }


