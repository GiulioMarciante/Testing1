import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MainTest {

    private final Main testing = new Main();
    @Test
    void sum_of_two_integer() {
        int testing2 = Main.sumOfInt(3,5);
        assertEquals(8,testing2,"Sum of 3 + 5 = 8!");
    }
    @Test
    void sum_of_two_negative_integer() {
        int testing2 = Main.sumOfInt(-2,-8);
        assertEquals(-10,testing2,"Sum of -2 + -8 = 10!");
    }
}