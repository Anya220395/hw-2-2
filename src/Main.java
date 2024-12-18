//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int account = 515;
        int sum = 500;
        int bonus = 11;

        if (sum > 1000) {
            bonus = sum/bonus;
        } else {
            bonus = 0;
        }
        System.out.println("Полученный бонус составил "+bonus);
        System.out.println("Итоговая сумма на счете: "+(account+sum+bonus));

    }
}