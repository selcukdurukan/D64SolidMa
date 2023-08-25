package com.ba.boost.solidDependencyInversionAndOpenClosed.worse;

public class Logger {
        /*
        * Sisteme text log ekledigimizde pek çok yerde modify etmek zorunda kalıyoruz.
        * 5-6 tane daha text yöntemi ekleyecek olsak her defasında constructor, switch ve LogType, WorseTest için
        * tasarım değişikliği
        * yapmamız gerekir.
        * */
    private DbLog dbLog;
    private XmlLog xmlLog;
    private TextLog textLog;

    /*
    *
    * Aşagıdaki constructor 3 farklı nesneye bağımlı, burası 10-15 de olabilirdi bu yüzden bu tasarım sorunludur.
    * Better'da araya bir interface ekleyip bağımlıkları bu interface üzerinden yönetirsek
    * bu constructor tek bir instance'a bağımlı olacaktır --> dependency inversion or injection, constructor injection.
    *  */
    public Logger(DbLog dbLog, XmlLog xmlLog, TextLog textLog) {
        this.dbLog = dbLog;
        this.xmlLog = xmlLog;
        this.textLog = textLog;
    }

    public void writeLog(LogType type, String value) {

        switch (type) {
            case DB:
                dbLog.Log(value);
                break;
            case XML:
                xmlLog.Log(value);
                break;
            case TEXT:
                textLog.Log(value);
                break;
            default:
                System.out.println("Cannot found Log Type.");
                break;
        }

    }
}
