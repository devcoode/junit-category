package category;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTests.class)
public class HelloSlowTest {

    @Test
    public void test(){
        Assert.assertEquals("hello", new Hello().greetings());
    }

}
