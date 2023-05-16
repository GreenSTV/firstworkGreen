public class restudy {
    public static void main(String[] args) {
        int amount = 100;
        int money = 120;
        int bonus = money / amount;
        int total1 = money + bonus;
        int total2 = money;
        if (money > 1000) {
            System.out.println(bonus);
            System.out.println(total1);
        }
        if (money < 1000) {
            System.out.println(0);
            System.out.println(total2);
        }

    }
}
