public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int topUpBonus = 100;
        int topUpAmount = 1500;
        int bonus;

        if (topUpAmount >= 1000) {
            bonus = topUpAmount / topUpBonus;
        } else {
            bonus = 0;
        }

        int totalAccount = clientAccount + topUpAmount + bonus;

        System.out.println("Вы пополнили счёт на " + topUpAmount + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
    }
}