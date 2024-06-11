package ru.netology.javaqa;

public class WorkRestService {
    public int calcRest(int money, int income, int expenses, int threshold, int restMonth) {

        for (short month = 1; month < 13; month++) {
            if (money >= threshold) {
                money =(money - expenses) / 3 ;
                restMonth = restMonth + 1;
            } else {
                money = money + income - expenses;
            }

        }
        return restMonth;
    }
}
