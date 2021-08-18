package calculator;

public class StringCalculator
{
    public static int add(String number)
    {
        if(number.equals(""))
        {
            return 0;
        }
        else
            return toInt(number);
    }

    private static int toInt(String number)
    {
        return Integer.parseInt(number);
    }
}
