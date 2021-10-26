package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MAC {
    public MAC(String IP) {
        Pattern pattern = Pattern.compile("((([a-z][A-Z]:){3})(([0-9]{2}:){2})[0-9]{2})");
        Matcher matcher = pattern.matcher(IP);
        boolean found = matcher.matches();
        if(found)
            System.out.println(IP + "  is right");
        else
            System.out.println(IP + "  is wrong");
    }
}
