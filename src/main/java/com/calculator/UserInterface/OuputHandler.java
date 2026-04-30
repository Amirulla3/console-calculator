package com.calculator.UserInterface;

public class OuputHandler {
    public void printMenu() {
        System.out.println("----------Menu----------");
        System.out.println("1.Калькулятор");
        System.out.println("2.История");
        System.out.println("3.Последнее выражение");
        System.out.println("4.Очистка истории");
        System.out.println("5.Выход");
        System.out.println("------------------------");
        System.out.println("Выбери операцию: ");
    }

    public void calculate(String expression, double result) {
        System.out.printf(expression + " = " + result + "\n");
    }

    public void outputString(String number) {
        System.out.println(number);
    }

    public void outputExpression() {
        System.out.println("Введите выражение: ");
    }

    public void printUnknownCommand() {
        System.out.println("Данной операции нет!");
    }

    public void exitFromCalculator() {
        System.out.println("Выход из режим калькулятор!");
    }

    public void printExitApp() {
        System.out.println("Выход из приложения!");
    }

    public void argumentException() {
        System.out.println("Неверный аргумент!");
    }

    public void aritmeticsException() {
        System.out.println("Деление на 0 невозможно!");
    }
}
