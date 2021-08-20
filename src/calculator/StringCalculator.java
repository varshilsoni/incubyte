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
            String delimiter = ",";
            if(number.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(number.charAt(2));
                number = number.substring(4);
            }

            String numList[] = splitNumbers(number, delimiter + "|\n");
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
        String negString = "";

        for(String number : numbers)
        {
            if(toInt(number) < 0)
            {
                if(negString.equals(""))
                    negString = number;
                else
                    negString += ("," + number);
            }
            total += toInt(number);
        }
            if(!negString.equals(""))
            {
                throw
                        new IllegalArgumentException("Negatives not allowed: " + negString);
            }
        return total;
    }
}
