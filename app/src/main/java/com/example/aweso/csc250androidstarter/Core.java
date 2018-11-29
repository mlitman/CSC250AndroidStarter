package com.example.aweso.csc250androidstarter;

public class Core
{
    public static String passedValue = "";

    public static char rot13(char c)
    {
        String alphaUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphaLower = alphaUpper.toLowerCase();

        if(alphaUpper.indexOf(c) != -1)
        {
            //it is a upper case char so convert it
            return alphaUpper.charAt((alphaUpper.indexOf(c)+13)%26);
        }
        else if(alphaLower.indexOf(c) != -1)
        {
            //it is a lower case char so convert it
            return alphaLower.charAt((alphaLower.indexOf(c)+13)%26);
        }
        else
        {
            return c;
        }
    }
}
