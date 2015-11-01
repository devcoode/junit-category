package category.test;

import category.marker.SlowTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SlowTest.class)
public class HelloSlowTest {
    @Test
    public void test() throws Exception {
        System.out.println("Running " + getClass().getSimpleName());
        Thread.sleep(3000);
    }
}
