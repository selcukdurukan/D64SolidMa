package com.ba.boost.solidDependencyInversionAndOpenClosed.better;

public class DbLog implements ILog {

    @Override
    public void writeLogOutput(String value) {
        System.out.println(value + " Db log'a kaydedildi.");
    }
}
