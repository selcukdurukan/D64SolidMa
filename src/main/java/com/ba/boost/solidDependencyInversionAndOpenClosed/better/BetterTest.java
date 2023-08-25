package com.ba.boost.solidDependencyInversionAndOpenClosed.better;

import com.ba.boost.solidDependencyInversionAndOpenClosed.worse.XmlLog;

public class BetterTest {

    public static void main(String[] args) {

        /*
        * Ilog üzerinden dependency'lerimize ulaşabiliriz. Yeni özellik ekledigimizde sadece Ilog interface'i implement edip
        * logger class'ının constructor'ını kullanarak feature'ı execute edebiliriz.
        * */

        XmlLog xmlLog = new XmlLog();
        DbLog dbLog = new DbLog();

        Logger log = new Logger(dbLog);

        log.writeLog("'404'");

    }
}
