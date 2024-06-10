package ru.netology.javaqa;

public class WorkRestService {
    public int calcBalance(int money, int income, int expenses, int threshold) {
        int balance;
        if (money >= threshold) {
            balance = money - ((money - expenses) / 3) - expenses;
        } else {
            balance = income - expenses;
        }
        return balance;
    }
}
