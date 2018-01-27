import java.util.Random;

public class randomMirror {

    public static void main(String[] args) {

        int[] randomArray = new int[10];

        Random randomNumber = new Random();

        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomNumber.nextInt(10);
        }

        for(int number: randomArray) {
            System.out.print(number);
        }

        for(int i = randomArray.length - 1; i >= 0; i--) {
            System.out.print(randomArray[i]);
        }
    }
}
