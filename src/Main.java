// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int count_up_to = 100;
        int sum = 300;
        int bonus;

        if (sum > 999) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }

        int balance = bonus + sum + count_up_to;
        System.out.println("сумма бонусов составила " + bonus);
        System.out.println("баланс составил " + balance);

    }

}