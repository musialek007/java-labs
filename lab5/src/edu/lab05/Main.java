package edu.lab05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static DataFile dataFile = null;
    private static Logger logger = Logger.getLogger("aLogger");
    private static FileHandler fh;

//    private static void assignLogger(){
//        try{
//            fh = new FileHandler("c:\\temp\\mojLoger.log", true);
//            looger.addHandler(fh);
//            fh.setFor(new SimpleFormatter());
//        }catch (SecurityException | IOException e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {

    }
}
