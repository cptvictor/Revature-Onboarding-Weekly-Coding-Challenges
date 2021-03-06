import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void java1() {
    }

    @Test
    void java2Success()
    {
        assertEquals(true, Main.java2("abcd", "dabc"));
    }

    @Test
    void java2SuccessMatchingLetterAtEnd()
    {
        assertEquals(true, Main.java2("abcd", "bcda"));
    }

    @Test
    void java2Failure()
    {
        assertEquals(false, Main.java2("abcd", "dbac"));
    }

    @Test
    void java2FailureNoMatchingLetter()
    {
        assertEquals(false, Main.java2("abcd", "hhhh"));
    }
}