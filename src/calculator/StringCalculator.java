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
            String input = ",";
            if(number.matches("//(.*)\n(.*)"))
            {
                input = Character.toString(number.charAt(2));
                number = number.substring(3);
            }

            String numList[] = splitNumbers(number, input + "|\n");
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
