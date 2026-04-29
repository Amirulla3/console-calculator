package com.calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExpressionNormalizer {
    Map<String, Integer> numbers = new HashMap<>(Map.of(
            "ноль", 0, "один", 1, "два", 2, "три", 3, "четыре", 4,
            "пять", 5, "шесть", 6, "семь", 7, "восемь", 8, "девять", 9
    ));
    Map<String, Integer> tens = new HashMap<>(Map.of(
            "одиннадцать", 11, "двенадцать", 12,
            "тринадцать", 13, "четырнадцать", 14, "пятнадцать", 15,
            "шестнадцать", 16, "семнадцать", 17, "восемнадцать", 18, "девятнадцать", 19));
    Map<String, Integer> dozen = new HashMap<>(Map.of(
            "десять", 10, "двадцать", 20, "тридцать", 30, "сорок", 40,
            "пятьдесят", 50, "шестьдесят", 60, "семьдесят", 70, "восемьдесят", 80,
            "девяносто", 90));
    Map<String, Integer> hundred = new HashMap<>(Map.of(
            "сто", 100, "двести", 200, "триста", 300, "четыреста", 400,
            "пятьсот", 500, "шестьсот", 600, "семьсот", 700, "восемьсот", 800,
            "девятьсот", 900, "тысяча", 1000));
    Map<String, String> operation = new HashMap<>();

    {
        operation.put("плюс", "+");
        operation.put("+", "+");
        operation.put("минус", "-");
        operation.put("-", "-");
        operation.put("умножение", "*");
        operation.put("*", "*");
        operation.put("деление", "/");
        operation.put("/", "/");
    }

    public String normalize(String input) {

        String ww = input.toLowerCase().trim();
        String[] tt = ww.split("\\s+");
        int operT = opr(tt);
        if (operT == 0 || operT == tt.length - 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        String[] firstHalf = Arrays.copyOfRange(tt, 0, operT);
        String[] secondHalf = Arrays.copyOfRange(tt, operT + 1, tt.length);
        String newOperation = operation.get(tt[operT]);

        int firstParseHalf = parseNumber(firstHalf);
        int secondParseHalf = parseNumber(secondHalf);

        return firstParseHalf + " " + newOperation + " " + secondParseHalf;

    }

    int opr(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (operation.containsKey(tokens[i]))
                return i;
        }
        throw new IllegalArgumentException();
    }

    int parseNumber(String[] number) {
        int result = 0;
        int lastRank = Integer.MAX_VALUE;

        for (String word : number) {

            int currentRank;

            if (hundred.containsKey(word)) {
                currentRank = 4;
                result += hundred.get(word);

            } else if (dozen.containsKey(word)) {
                currentRank = 3;
                result += dozen.get(word);

            } else if (tens.containsKey(word)) {
                currentRank = 2;
                result += tens.get(word);
            } else if (numbers.containsKey(word)) {
                currentRank = 1;
                result += numbers.get(word);

            } else if (word.matches("\\d+")) {
                currentRank = 0;
                result += Integer.parseInt(word);

            } else {
                throw new IllegalArgumentException("Неизвестное число: " + word);
            }

            if (currentRank > lastRank) {
                throw new IllegalArgumentException("Неверный порядок числа");
            }

            lastRank = currentRank;
        }
        return result;
    }
}
