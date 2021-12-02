package TestMails;

import Mails.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMailSender {
    MailSender sender;
    MailInfo mailinfo;
    Client client;

    @Before
    public void init(){
        client = new Client("John Smith", 30, Gender.MALE, "john.smith@gmail.com");
        sender = new MailSender();
        mailinfo = new MailInfo(TextType.BIRTHDAY, client);
    }

    @Test
    public void testMailSender(){
        Assert.assertTrue(sender.sendMail(mailinfo));
    }
}
