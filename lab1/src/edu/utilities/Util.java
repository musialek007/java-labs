package edu.utilities;

import java.util.Date;

public class Util {
    public static void printLogMsg(String msg) {
        System.out.println(new Date() + ": " + msg);
    }
}
