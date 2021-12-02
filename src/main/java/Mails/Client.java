package Mails;

import lombok.Getter;


@Getter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    private int nextId = 0;

    public Client() {
        this.id = getNextId();
    }

    public Client(String name, int age, Gender sex, String email) {
        this.id = getNextId();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    private int getNextId(){
        nextId++;
        return nextId;
    }
}
