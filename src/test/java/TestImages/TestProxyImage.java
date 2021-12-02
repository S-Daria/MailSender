package TestImages;

import Images.ProxyImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProxyImage {
    ProxyImage image;

    @Before
    public void init() {
        image = new ProxyImage("image.png");
    }


    @Test
    public void testProxyImage() {
        Assert.assertEquals(image.getFileName(), "image.png");
        Assert.assertTrue(image.display());
    }
}
