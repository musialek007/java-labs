package edu.lab01;

import edu.utilities.Util;

public class Main {
    void main(String[] args) {
        Util.printLogMsg("program start" + ((args.length>0)?":"+args[0]:""));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Util.printLogMsg("program stop" + ((args.length>0)?":"+args[0]:""));
    }
}
