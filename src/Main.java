public class Main {
    public static void main(String[] args) {
        int number = 15;

        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) System.out.printf("nearest square number is %d%n", number);
            if (i * i < number && (i + 1) * (i + 1) > number) {
                if (number - i * i < (i + 1) * (i + 1) - number)
                    System.out.printf("nearest square number is %d%n", i * i);
                else System.out.printf("nearest square number is %d%n", (i + 1) * (i + 1));
            }
        }
    }
}