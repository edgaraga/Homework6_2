import ru.netology.bonus.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual1 = service.calculate(1000_60, true);
        long expected1 = 30;
        System.out.println("ОР: " + expected1 + ", ФР: " + actual1);

        long actual2 = service.calculate(10_000_000_60, true);
        long expected2 = 500;
        System.out.println("ОР: " + expected2 + ", ФР: " + actual2);

        long actual3 = service.calculate(1000_60, false);
        long expected3 = 10;
        System.out.println("ОР: " + expected3 + ", ФР: " + actual3);

        long actual4 = service.calculate(10_000_000_60, false);
        long expected4 = 500;
        System.out.println("ОР: " + expected4 + ", ФР: " + actual4);
    }
}
