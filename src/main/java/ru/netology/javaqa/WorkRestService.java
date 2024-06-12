package ru.netology.javaqa;

public class WorkRestService {
    public byte calcRest(int income, int expenses, int threshold) {
        int money = 0;
        byte restMonth = 0;
        for (byte month = 1; month < 13; month++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                restMonth = (byte) (restMonth + 1);
            } else {
                money = money + income - expenses;
            }

        }
        return restMonth;
    }
}
