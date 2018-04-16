package cn.bgs.retrofit.postrequst;

import java.util.HashMap;
import java.util.Map;

import cn.bgs.retrofit.bean.PostBean;
import cn.bgs.retrofit.bean.TestBean;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

/**
 * Created by Administrator on 2017/12/11.
 */

public interface PostService {


    @FormUrlEncoded
    @POST("toutiao/index")
    Call<PostBean> postString(@Field("type") String type, @Field("key") String key);

    // Post表单提交-多个参数-@FieldMa
    @FormUrlEncoded
    @POST("toutiao/index")
    Call<PostBean> postString2(@FieldMap HashMap<String, String> params);

    // Post文件提交 ，每个键值对都需要用@Part注解键名字
    //Multipart 支持文件上传
    @Multipart
    @POST("xxxx")
    Call<TestBean> postFile(@Part("photo\";filename=\"ceshi.png\"") RequestBody body, @Field("token") String token);

    @Multipart
    @POST("xxxx")
    Call<TestBean> postFile2(@PartMap HashMap<String,RequestBody> bodyMap, @Field("token") String token);


}
