package Mails;

public enum TextType {
    BIRTHDAY("happy birthday!"),
    DISCOUNT("don't miss 15% discount in our shop!");

    private String text;

    TextType(String text){
        this.text = text;
    }

    public String EmailText(Client client){
        return client.getName() + ", " + this.text;
    }
}
