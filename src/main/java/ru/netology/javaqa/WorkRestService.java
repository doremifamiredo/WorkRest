package ru.netology.javaqa;

public class WorkRestService {
    public void calcBalance (int income, int expenses, int threshold) {
        int money = 0;
        int balance = money;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                balance = money - ((money - expenses) / 3) - expenses;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", а затем ещё -" + balance);
                money = money - balance - expenses;
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
                balance = money;
            }
        }
    }
}
