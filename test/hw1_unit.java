import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class hw1_unit {
    private Hw1 hw1;

    @Before
    public void setupUp(){
        hw1 = new Hw1();
    }

    @After
    public void setupDown(){
        hw1 = null;
    }

//    @Test
//    public void Part1_1(){
//        int res = hw1.Part1(1,0);
//        Assert.assertEquals(6,res);
//    }

    @Test
    public void Part3_1(){
        int res = hw1.Part3(1,2,3);
        Assert.assertEquals(6,res);
    }

    @Test
    public void Part3_2(){
        int res = hw1.Part3(-1,2,3);
        Assert.assertEquals(5,res);
    }

    @Test
    public void Part3_3(){
        int res = hw1.Part3(-1,-2,3);
        Assert.assertEquals(3,res);
    }

    @Test
    public void Part3_4(){
        int res = hw1.Part3(-1,-2,-3);
        Assert.assertEquals(0,res);
    }

    @Test
    public void Part4_1(){
        int res = hw1.Part4(1,1,1);
        Assert.assertEquals(6,res);
    }

    @Test
    public void Part4_2(){
        int res = hw1.Part4(0,1,1);
        Assert.assertEquals(5,res);
    }

    @Test
    public void Part4_3(){
        int res = hw1.Part4(0,-1,1);
        Assert.assertEquals(3,res);
    }

    @Test
    public void Part4_4(){
        int res = hw1.Part4(0,0,0);
        Assert.assertEquals(3,res);
    }

    @Test
    public void Part4_5(){
        int res = hw1.Part4(-2,-1,1);
        Assert.assertEquals(5,res);
    }

    @Test
    public void Part5_1(){
        String res = hw1.Part5(0);
        Assert.assertEquals("F",res);
    }

    @Test
    public void Part5_2(){
        String res = hw1.Part5(22);
        Assert.assertEquals("E",res);
    }

    @Test
    public void Part5_3(){
        String res = hw1.Part5(46);
        Assert.assertEquals("D",res);
    }

    @Test
    public void Part5_4(){
        String res = hw1.Part5(74);
        Assert.assertEquals("C",res);
    }

    @Test
    public void Part5_5(){
        String res = hw1.Part5(85);
        Assert.assertEquals("B",res);
    }

    @Test
    public void Part5_6(){
        String res = hw1.Part5(100);
        Assert.assertEquals("A",res);
    }

    @Test
    public void Part5_7(){
        String res = hw1.Part5(-100);
        Assert.assertEquals("Введите значение от 0 до 100",res);
    }

    @Test
    public void Part5_8(){
        String res = hw1.Part5(101);
        Assert.assertEquals("Введите значение от 0 до 100",res);
    }
}
