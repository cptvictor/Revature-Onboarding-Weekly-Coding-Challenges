import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void java1() {
    }

    @Test
    void java2()
    {
        assertEquals(true, Main.java2("abcd", "dabc"));
    }
}