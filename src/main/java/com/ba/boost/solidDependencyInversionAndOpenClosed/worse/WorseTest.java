package com.ba.boost.solidDependencyInversionAndOpenClosed.worse;

public class WorseTest {

    public static void main(String[] args) {

        /*
         * Sisteme text log ekledigimizde pek çok yerde modify etmek zorunda kalıyoruz.
         * 5-6 tane daha text yöntemi ekleyecek olsak her defasında constructor, switch ve LogType, WorseTest için
         * tasarım değişikliği
         * yapmamız gerekir, bu open-closed'a aykırı bu yüzden bunu dependency inversion ile çözecegiz.
         * */

        XmlLog xmlLog = new XmlLog();
        DbLog dbLog = new DbLog();
        TextLog textLog = new TextLog();

        Logger logger = new Logger(dbLog, xmlLog, textLog);

        logger.writeLog(LogType.TEXT, "'303 nolu hata kodu'");


    }
}
