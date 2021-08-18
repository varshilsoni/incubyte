package calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCases
{
    public static void main(String args[])
    {
        System.out.println("Starting the code and Test Cases");
    }
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
}
