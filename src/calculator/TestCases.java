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
    public void testEmptyString()
    {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void oneNumber()
    {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void twoNumbers()
    {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void threeNumbers()
    {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void testNewLine()
    {
        assertEquals(6, StringCalculator.add("1\n2,3"));

        //generating the NumberFormatException because of \"n" , so to handle that we write this following code.
        /*
        String input= " \n,";
        String pattern ="-? // \n , ;";
        if(input.matches("-? // \n+,")){}
        */
    }

    @Test
    public void otherDelimiter()
    {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    public void testNegativeNumber()
    {
        try
        {
            StringCalculator.add("-1,2");
        }
        catch (IllegalArgumentException e){
            assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }

        try
        {
            StringCalculator.add("2,-3,4,-5");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(e.getMessage(), "Negatives not allowed: -3,-5");
        }
    }

    @Test
    public void overThousand()
    {
        assertEquals(2, StringCalculator.add("1000,2"));
    }
}

