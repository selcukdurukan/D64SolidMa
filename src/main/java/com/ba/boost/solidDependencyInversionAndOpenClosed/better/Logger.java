package com.ba.boost.solidDependencyInversionAndOpenClosed.better;

public class Logger {

    /*
     * Logger constructor'ına ILog interface'ini impelemente eden hangi class olursa olsun bunu kabul edecek.
     *  --> Dependency injection constructor.
     * WritelogOutput object'e göre polymorhpic çalışır.
     * Spring framewrok bu dependency constructor injection yaklaşımını kullanır ögrenmek önemli.
     * */

    public ILog whichLog;

    public Logger(ILog whichLog) {
        this.whichLog = whichLog;
    }

    public void writeLog(String value) {
        this.whichLog.writeLogOutput(value); //Gelen objenin içindeki ilgili methoda gider.
    }
}
