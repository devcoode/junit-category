package category;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest1 {

   @Test
    public void test(){
       Assert.assertEquals("hello", new Hello().greetings());
   }
}
