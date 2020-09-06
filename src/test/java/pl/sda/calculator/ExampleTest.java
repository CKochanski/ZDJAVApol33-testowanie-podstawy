package pl.sda.calculator;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExampleTest {

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - ta metoda wykona się tylko raz przed testami");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - ta metoda wykona się przed każdym testem");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach - metoda wykona sie po kazdym tescie");
    }

    @AfterAll
    static void done() {
        System.out.println("@AfterAll - metoda ta wykona sie po po wszystkich testach");
    }

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 2 do 3")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = arg1 + arg2;

        //then
        assertEquals(5, actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 2 dla operacji odejmowania 10 od 12")
    void shouldReturnTwoForSubtractionOperation() {
        //given
        int arg1 = 12;
        int arg2 = 10;

        //when
        int actual = arg1 - arg2;

        //then
        assertEquals(2, actual);
    }

    @Test
    @DisplayName("Liczba powinna być parzysta")
    void shouldBeAnEvenValue() {
        //given
        int arg = 4;

        //when
        boolean actual = arg % 2 == 0;

        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrocic 6 dla operacji mnozenia 2 razy 3")
    void shouldReturnSixFor2TimesThree() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = arg1 * arg2;

        //then
        assertThat(actual).isEqualTo(6);
    }

    @Test
    @DisplayName("Liczba powinna być nieparzysta")
    void shouldBeAnOddValue() {
        //given
        int arg = 5;

        //when
        boolean actual = arg % 2 == 0;

        //then
        assertThat(actual).isFalse();
    }
}
