package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class TestForCheck_lesson_3_1 {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Тест суммирования 2 чисел")
    @CsvSource({"13, 5, 18"})
    @Timeout(10)
    @Tag("Сумма")
    void sum(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int resultSum = calc.sum(a, b);
        Assertions.assertEquals(expectedResult, resultSum, "Неправильный ответ");
    }

    @ParameterizedTest(name = "#{index} - Вычитание {1} из {0}, ожидаем {2}")
    @DisplayName("Тест вычитания второго числа из первого")
    @CsvSource({"13, 5, 8"})
    @Timeout(10)
    @Tag("Вычитание")
    void subtraction(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int resultSubtraction = calc.subtraction(a,b);
        Assertions.assertEquals(expectedResult, resultSubtraction, "Неправильный ответ");
    }
}