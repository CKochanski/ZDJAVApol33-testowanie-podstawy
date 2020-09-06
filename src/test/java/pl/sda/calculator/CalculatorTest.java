package pl.sda.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5, actual);
    }

    @Test
    void shouldBeDividableByThree() {
        //given
        int arg = 9;

        //when
        boolean actual = sut.isDividableByThree(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 14 przy odejmowaniu 7 od 21")
    void shouldReturnFourteenForGivenArgsOnSubtractionOperation() {
        //given
        int arg1 = 21;
        int arg2 = 7;

        //when
        int actual = sut.subtract(arg1, arg2);

        //then
        assertEquals(14, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 10 przy mnozeniu 5 razy 2")
    void shouldReturnTenForTwoTimesFive() {
        //given
        int arg1 = 5;
        int arg2 = 2;

        //when
        int actual = sut.multiply(arg1, arg2);

        //then
        assertEquals(10, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 0 przy mnożeniu razy 0")
    void shouldReturnZeroForMultiplicationTimesZero() {
        //given
        int arg1 = 0;
        int argThatsValueIsNotImportant = 919;

        //when
        int actual = sut.multiply(argThatsValueIsNotImportant, arg1);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 5 przy dzieleniu 10 przez 2")
    void shouldReturnFiveForDivisionTenByTwo() {
        //given
        int arg1 = 10;
        int arg2 = 2;

        //when
        int actual = sut.divide(arg1, arg2);

        //then
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 0 przy dzieleniu czegokolwiek przez 0")
    void shouldReturnZeroForDivisionByZero() {
        //given
        int argThatsValueIsNotImportant = 10;
        int arg2 = 0;

        //when
        int actual = sut.divide(argThatsValueIsNotImportant, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 0 dla dzielenia 0 przez cokolwiek")
    void shouldReturnZeroForZeroDividedByAnything() {
        //given
        int arg = 0;
        int argThatsValueIsNotImportant = 100;

        //when
        int actual = sut.divide(arg, argThatsValueIsNotImportant);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic prawde dla liczby parzystej")
    void shouldReturnTrueForEvenValue() {
        //given
        int arg = 6;

        //when
        boolean actual = sut.isEven(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic falsz dla liczby nieparzystej")
    void shouldReturnFalseForOddValue() {
        //given
        int arg = 5;

        //when
        boolean actual = sut.isEven(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic prawde dla liczby nieparzystej")
    void shouldReturnTrueForOddValue() {
        //given
        int arg = 5;

        //when
        boolean actual = sut.isOdd(arg);

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic falsz dla liczby parzystej")
    void shouldReturnFalseForEvenValue() {
        //given
        int arg = 6;

        //when
        boolean actual = sut.isOdd(arg);

        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 0.5 przy liczeniu 10% z 5")
    void shouldReturnProperPercentage() {
        //given
        double arg1 = 5;
        double arg2 = 10;

        //when
        double actual = sut.percentage(arg1, arg2);

        //then
        assertEquals(0.5d, actual, 0.0000001d);
    }

    @Test
    @DisplayName("Powinno zwrocic 200 przy liczeniu 10% z 2000")
    void shouldReturnProperPercentageForIntegerNumber() {
        //given
        double arg1 = 2000;
        double arg2 = 10;

        //when
        double actual = sut.percentage(arg1, arg2);

        //then
        assertEquals(200.0d, actual, 0.0000001d);
    }
}
