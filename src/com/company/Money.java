package com.company;
import  java.util.*;
import java.util.regex.*;
import  java.lang.String;
public class Money {
    public Money() {
        System.out.println("Enter the list of prices");
        Scanner scan = new Scanner(System.in);
        String str_1 = "(([0]){1}+[.]+(\\d){2}+\s+(USD))|";
        String str_2 = "(([0]){1}+[.]+(\\d){2}+\s+(EU))|";
        String str_3 = "(([0]){1}+[.]+(\\d){2}+\s+(RUR))|";
        String str_4 = "([1-9]+(\\d*)+[.]+([0-9]){2}+\s+(USD))|";
        String str_5 = "([1-9]+(\\d*)+[.]+([0-9]){2}+\s+(EU))|";
        String str_6 = "([1-9]+(\\d*)+[.]+([0-9]){2}+\s+(RUR))";

        Pattern pattern = Pattern.compile(str_1+str_2+str_3+str_4+str_5+str_6);
        String[] str_split = scan.nextLine().split(", ");

        for (int i = 0; i < str_split.length; i++)
        {
            Matcher matcher = pattern.matcher(str_split[i]);
            if(matcher.matches())
            {
                System.out.println(str_split[i]);
            }
        }
    }
}
