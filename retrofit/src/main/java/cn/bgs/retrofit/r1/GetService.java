package cn.bgs.retrofit.r1;

import java.util.HashMap;

import cn.bgs.retrofit.bean.GetBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2017/12/25.
 */

public interface GetService {
    // 1.直接拼接，记得加问号,好像必须带toutiao/index
    @GET("toutiao/index?type=shehui&key=d05b58fa6901ad9bed77a1ef08bd6ccb")
    Call<GetBean> getString();

    //2.{name}可以最简单的将其理解为路径替换块，用”{}”表示，与注解@path配合使用 ,为了解耦,参数name=toutiao
    @GET("{name}/index?type=shehui&key=d05b58fa6901ad9bed77a1ef08bd6ccb")
    Call<GetBean> getString2(@Path("name") String name);
    //3.对于@GET来说，参数信息是可以直接放在url中上传的。那么你马上就反应过来了，这一样也存在严重的耦合！于是，就有了@query
    @GET("{name}/index")
    Call<GetBean> getString3(@Path("name")String name,@Query("type") String type ,@Query("key") String key);
    //4.假设我要在参数中上传10个参数呢？这意味着我要在方法中声明10个@Query参数？当然不是！
    //Retrofit也考虑到了这点，所以针对于复杂的参数上传，为我们准备了@QueryMap
    @GET("{name}/index")
    Call<GetBean> getString4(@Path("name") String name, @QueryMap HashMap<String,String> hashMap);
}
