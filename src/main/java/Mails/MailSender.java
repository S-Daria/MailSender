package Mails;

public class MailSender {
    public boolean sendMail(MailInfo info){
        System.out.println(info.constructEmail() + " sent to " + info.getClient().getEmail());
        return true;
    }
}
