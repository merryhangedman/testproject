import org.testng.Assert;
import org.testng.annotations.Test;


public class MyNameTest extends ProgramTest {

    @Test
    public void testMyNameSuccess(){
        Assert.assertEquals(program.sayMyName("Gabe Newell",3),"Name is Gabe Newell (3)");
    }

    @Test
    public void testMyNameValidationZeroAge(){
        Assert.assertThrows(IllegalStateException.class,() -> program.sayMyName("Gabe Newell",0));
    }

    @Test
    public void testMyNameValidationNegativeAge(){
        Assert.assertThrows(IllegalStateException.class,() -> program.sayMyName("Gaben", -1));
    }
    @Test
    public void testMyNameValidationEmptyName(){
        Assert.assertThrows(IllegalStateException.class,() -> program.sayMyName("",55));
    }
    @Test
    public void testMyNameValidationNullName(){
        Assert.assertThrows(IllegalStateException.class,() -> program.sayMyName(null,22));
    }

}
