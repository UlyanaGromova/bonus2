//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialBalance = 300;
        int addend = 1100;

        int bonus = (addend > 1000 ? addend / 100 : 0);

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Бонус: " + bonus);

    }
}
