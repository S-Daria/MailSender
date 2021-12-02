package Mails;

import lombok.Getter;

public class MailInfo {
    @Getter
    private Client client;
    private TextType mailCode;

    public MailInfo(TextType mailCode, Client client) {
        this.mailCode = mailCode;
        this.client = client;
    }

    public String constructEmail(){
        return this.mailCode.EmailText(this.client);
    }


}
