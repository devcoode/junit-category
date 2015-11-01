package category.test;

import category.Hello;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest1 {
    @Test
    public void test() {
        System.out.println("Running " + getClass().getSimpleName());
        Assert.assertEquals("hello, kyle", new Hello().greetings("kyle"));
    }
}
