import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void test1(){
        // act
        Action action = () ->  kabumMethod();

        // assert
        Exception ex = AssertUtil.assertThrows(IllegalArgumentException.class, action);
        Assert.assertEquals("kabum!!", ex.getMessage());
    }

    private void kabumMethod() {
        throw new IllegalArgumentException("kabum!!");
    }
}
