package com.company;
import  java.lang.String ;
import java.util.regex.*;
public class Mask {
    public Mask(String mask) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher(mask);
        boolean found = matcher.matches();
        if(found)
            System.out.println(mask + "  is right");
        else
            System.out.println(mask + "  is wrong");
    }
}
