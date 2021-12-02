package Mails;

import java.util.LinkedList;

public class MaiBox {
    private final LinkedList<MailInfo> infoStorage = new LinkedList<>();

    public void addInfo(MailInfo info) {
        infoStorage.add(info);
    }

    public void sendAll(){
        MailSender sender = new MailSender();

        for (MailInfo info: infoStorage) {
            sender.sendMail(info);
        }
    }
}
