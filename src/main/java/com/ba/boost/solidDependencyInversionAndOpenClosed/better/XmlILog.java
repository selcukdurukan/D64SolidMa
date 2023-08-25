package com.ba.boost.solidDependencyInversionAndOpenClosed.better;

public class XmlILog implements ILog {

    @Override
    public void writeLogOutput(String value) {
        System.out.println(value + " XML log'a kaydedildi.");
    }
}
