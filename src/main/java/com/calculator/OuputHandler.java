package com.calculator;

public class OuputHandler {
    void printMenu() {
        System.out.println("----------Menu----------");
        System.out.println("1.Калькулятор");
        System.out.println("2.История");
        System.out.println("3.Последнее выражение");
        System.out.println("4.Очистка истории");
        System.out.println("5.Выход");
        System.out.println("------------------------");
        System.out.println("Выбери операцию: ");
    }

    void calculate(String expression, double result) {
        System.out.printf(expression + " = " + result + "\n");
    }

    void outputString(String number) {
        System.out.println(number);
    }

    void outputExpression() {
        System.out.println("Введите выражение: ");
    }

    void printUnknownCommand() {
        System.out.println("Данной операции нет!");
    }

    void exitFromCalculator() {
        System.out.println("Выход из режим калькулятор!");
    }

    void printExitApp() {
        System.out.println("Выход из приложения!");
    }

    void argumentException() {
        System.out.println("Неверный аргумент!");
    }

    void aritmeticsException() {
        System.out.println("Деление на 0 невозможно!");
    }
}
