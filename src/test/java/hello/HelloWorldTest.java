package hello;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by panzer on 9/26/16.
 */
public class HelloWorldTest {

    @Test
    public void testLengthOfTheUniqueKey() {
        HelloWorld obj = new HelloWorld();
        Assert.assertEquals(36, obj.generateUniqueKey().length());
    }

//    @Test(expected = AssertionError.class)
    @Test
    public void failTest() {
        Assert.assertEquals(1, 2);
    }
}
