package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {
    @BeforeAll
    public static void setupAll() {
        System.out.println("Before All");
    }
    @BeforeEach
    public void setupEach() {
        System.out.println("Before Each");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @Test
    @DisplayName("Тест суммирования 2 чисел")
    @Timeout(10)
    @Tag("sum")
    void sum() {
        Calc calc = new Calc();
        int resultSum = calc.sum(3, 5);
        Assertions.assertEquals(8, resultSum, "Неправильный ответ");
    }

    @Test
    @DisplayName("Тест вычитания второго числа из первого")
    @Timeout(10)
    @Tag("subst")
    void subtraction() {
        Calc calc = new Calc();
        int resultSubtraction = calc.subtraction(15,4);
        Assertions.assertEquals(11, resultSubtraction, "Неправильный ответ");
    }

    @ParameterizedTest (name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @DisplayName("Второй тест суммирования")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Timeout(10)
    @Tag("param")
    void sum2(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int resultSum = calc.sum(a, b);
        Assertions.assertEquals(expectedResult, resultSum, "Неправильный ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Тест вычитания второго числа из первого")
    @Timeout(10)
    @Tag("subst")
    void subtraction2() {
        Calc calc = new Calc();
        int resultSubtraction = calc.subtraction(15,4);
        Assertions.assertEquals(11, resultSubtraction, "Неправильный ответ");
    }
}
