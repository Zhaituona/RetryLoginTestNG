package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPractice {


    @Test
    public void test1(){
        Assert.assertEquals(false,true);
    }
    @Test
    public void test2(){

        Assert.assertEquals(false,true);
    }
    @Test
    public void test3(){
        Assert.assertEquals(true,true);
    }
}
