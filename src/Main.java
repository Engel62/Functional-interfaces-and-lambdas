import java.util.function.Consumer;
import java.util.function.Predicate;

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


        }

    }


