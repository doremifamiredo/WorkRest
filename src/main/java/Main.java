import ru.netology.javaqa.WorkRestService;

public class Main {

    public static void main(String[] args) {
        WorkRestService service = new WorkRestService();
        int balance;
        int money = 0;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                balance = money - ((money - expenses) / 3) - expenses;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", а затем ещё -" + balance);
                money = money - balance - expenses;
            } else {
                balance = income - expenses;
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + balance;
            }
        }
         income = 10_000;
         expenses = 3_000;
         threshold = 20_000;
        byte restMonth = service.calcRest(income, expenses, threshold);
        System.out.println("Месяцев отдыха: " + restMonth);
    }
}
