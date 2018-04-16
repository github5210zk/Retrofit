package cn.bgs.retrofit;

import org.junit.Test;

import cn.bgs.retrofit.utils.RetrofitHelper;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getTest(){
        RetrofitHelper refrofitUtil=new RetrofitHelper();
        String request = refrofitUtil.getRequest();
        assertEquals("222", request);

    }
}