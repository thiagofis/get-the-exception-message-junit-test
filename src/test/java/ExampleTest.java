import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void test1(){
        // act
        Action action = () ->  kabumMethod();

        // assert
        Exception ex = AssertUtil.assertThrows(IllegalAccessException.class, action);
        Assert.assertEquals("kabum!!", ex.getMessage());
    }

    private void kabumMethod() {
        throw new IllegalArgumentException("kabum!!");
    }
}
