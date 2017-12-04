package lambdas;

public class Starter {
    public static void main(String[] args) {
        test(a -> "Żart: " + a, 5);
    }

    public static void test(JokeInterface jokeInterface, int asd){
        System.out.println(jokeInterface.makeJoke("TEST ZART"));
    }
}
