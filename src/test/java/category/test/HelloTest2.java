package category.test;

import category.Hello;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest2 {
    @Test
    public void test() {
        System.out.println("Running " + getClass().getSimpleName());
        Assert.assertEquals("hi, what's your name?", new Hello().greetings(null));
    }
}
