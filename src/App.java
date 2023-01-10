import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {

            int number = read.nextInt();
            
            for (int i = 0; i <= number; i++) {
                String numbers="";
                for (int j = 0; j < i; j++) {
                    numbers += i + "";
                }
                System.out.println(numbers);
            }
        }
    }
}
