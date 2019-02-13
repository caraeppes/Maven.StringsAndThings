package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class GIsHappyTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void gIsHappyTest1(){
        Boolean actual = stringsAndThings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = stringsAndThings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }

    /*@Test
    public void gIsHappyTest3(){
        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
        Assert.assertTrue(actual);
    }
    */

    @Test
    public void gIsHappyTest4(){
        // Given
        String happyString = "ggffggfdgg";

        // When
        Boolean actual = stringsAndThings.gIsHappy(happyString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest5(){
        // Given
        String lonelyG = "g";

        // When
        Boolean actual = stringsAndThings.gIsHappy(lonelyG);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest6(){
        // Given
        String twoGs = "gg";

        // When
        Boolean actual = stringsAndThings.gIsHappy(twoGs);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest7(){
        // Given
        String sadG = "gghappygsad";

        // When
        Boolean actual = stringsAndThings.gIsHappy(sadG);

        // Then
        Assert.assertFalse(actual);
    }


}
