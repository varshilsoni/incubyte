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
        {
            String numList[] = splitNumbers(number, ",");
            return sum(numList);
        }
    }
    private static int toInt(String number)
    {
        return Integer.parseInt(number);
    }
    private static String[] splitNumbers(String numbers, String split)
    {
        return numbers.split(split);
    }
        private static int sum(String[] numbers)
        {
        int total = 0;
        for(String number : numbers){
            total += toInt(number);
        }
        return total;
    }


}
