import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void hypotenuse() {
        Assertions.assertEquals(Main.hypotenuse(10,20), 22.360679774997898);
    }
}