package TestMails;

import Mails.Client;
import Mails.Gender;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestClient {
    Client client;

    @Before
    public void init() {
        client = new Client("John Smith", 30, Gender.MALE, "john.smith@gmail.com");
    }

    @Test
    public void testClient() {
        Assert.assertEquals(client.getName(), "John Smith");
        Assert.assertEquals(client.getAge(), 30);
        Assert.assertEquals(client.getEmail(), "john.smith@gmail.com");
        Assert.assertEquals(client.getId(), (int)client.getId());
    }
}
