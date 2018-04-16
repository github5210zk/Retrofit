package cn.bgs.retrofit.utils;

import android.widget.Toast;

import java.io.IOException;
import java.util.HashMap;

import cn.bgs.retrofit.bean.PostBean;
import cn.bgs.retrofit.bean.TestBean;
import cn.bgs.retrofit.postrequst.PostService;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/12/11.
 */

public class RetrofitHelper {

    Retrofit retrofit = null;
    //    String   BASEURL  = "xxxxxxxxxx";
    String   BASEURL  = "http://192.168.190.188/Goods/app/";

    private final PostService mService;
    public static RetrofitHelper retrofitHelper = new RetrofitHelper();

    private RetrofitHelper() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //通过retrofit类去把我们的网络请求service实例化出来
        mService = retrofit.create(PostService.class);
    }


    public static RetrofitHelper getInstance() {
        return retrofitHelper;
    }

    //提供一些方法去调用service实体类的方法，RequestBody上传单个文件
    public void uploadFile(RequestBody body, final OnSuccessListener listener) {
        Call<TestBean> call = mService.postFile(body, "");
        call.enqueue(new Callback<TestBean>() {
            @Override
            public void onResponse(Call<TestBean> call, Response<TestBean> response) {
                listener.onSuccess(response);
            }

            @Override
            public void onFailure(Call<TestBean> call, Throwable t) {
                listener.onFaile();
            }
        });

    }

    //提供一些方法去调用service实体类的方法，HashMap上传多个文件
    public void uploadFile2(HashMap<String, RequestBody> map, final OnSuccessListener listener) {
        Call<TestBean> call = mService.postFile2(map, "");
        call.enqueue(new Callback<TestBean>() {
            @Override
            public void onResponse(Call<TestBean> call, Response<TestBean> response) {
                listener.onSuccess(response);
            }

            @Override
            public void onFailure(Call<TestBean> call, Throwable t) {
                listener.onFaile();
            }
        });

    }

    //当我获取数据成功后要做什么处理
    public interface OnSuccessListener {
        void onSuccess(Object o);

        void onFaile();
    }

}
