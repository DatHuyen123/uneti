import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer n = rand.nextInt(899999);
        n = n + 100000;
        System.out.println(n.toString());
    }
}
