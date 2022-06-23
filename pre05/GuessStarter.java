import java.util.Random;

public class GuessStarter {

    public static void main(String[] args) {
        System.out.print("Roll: ");
        Random random = new Random();
        int number = random.nextInt(12) + 1;
        System.out.println(number);

      }
}