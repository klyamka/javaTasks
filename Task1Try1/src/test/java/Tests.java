import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testRanged(){
        int min = 1;
        int max = 10;

        String expected = "1 1 2 3 5 8";

        Assert.assertEquals(expected,Main.fibonacciSequenceRanged(min,max));
    }

    @Test
    public void testLength(){
        int length=1;

        String expected = "1 1 2 3 5 8";

        Assert.assertEquals(expected,Main.fibonacciSequenceLength(length));
    }
}
