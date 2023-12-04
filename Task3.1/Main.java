public class Main {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();

        int number1 = 4;
        int number2 = 7;

        System.out.println(number1 + " четное: " + checker.evenOddNumber(number1));
        System.out.println(number2 + " четное: " + checker.evenOddNumber(number2));
    }
}