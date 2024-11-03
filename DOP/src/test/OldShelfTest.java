package test;

import org.junit.Test;
import org.junit.Assert;
import oldshelf.*;

public class OldShelfTest {
    @Test
    public void testOldSelection1() {
        Assert.assertTrue(OldSelection.getAgeOrTitle(new Comic("Spiderman", 35)) == "Spiderman");
    }

    @Test
    public void testOldSelection2() {
        Assert.assertFalse(OldSelection.getAgeOrTitle(new Comic("Spiderman", 35)) == "Spider");
    }
}
