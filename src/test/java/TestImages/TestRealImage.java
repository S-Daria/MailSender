package TestImages;

import Images.RealImage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRealImage {
    RealImage image;

    @Before
    public void init() {
        image = new RealImage("image.png");
    }

    @Test
    public void testRealImage() {
        Assert.assertTrue(image.display());
    }
}
