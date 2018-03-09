package cn.bgs.retrofit.r;

import java.util.Map;

import cn.bgs.retrofit.bean.PostBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/12/11.
 */

public interface PostService {

//    @POST("toutiao/index")
//    Call<ResponseBody>  getPostString(@QueryMap HashMap<String,String> map);

    //TODO 使用失败  @BODY 请求体    通过@BODY这种方式封装请求体，Retrofit是通过JSON的形式来封装数据的
    @POST("toutiao/index")
    Call<PostBean> postString(@Body BodyUser user);

    //    编码都可以使用  使用该注解过后
    @FormUrlEncoded
    @POST("toutiao/index")
    Call<PostBean> postString2(@Field("type") String type, @Field("key") String key);
    // Post表单提交-多个参数-@FieldMa
    @FormUrlEncoded
    @POST("login")
    Call<PostBean> postString3(@FieldMap Map<String,String> params);

    //另一种解决方式：在Request-Header中设置charset信息。于是，这个时候就涉及到添加请求头了
    @Headers("Content-type:application/x-www-form-urlencoded;charset=UTF-8")
    @FormUrlEncoded
    @POST("toutiao/index")
    Call<PostBean> postString4(@Field("type") String type, @Field("key") String key);




     class BodyUser {
        private String type;
        private String key;

        public BodyUser(String type, String key) {
            this.type = type;
            this.key = key;
        }
    }

}
