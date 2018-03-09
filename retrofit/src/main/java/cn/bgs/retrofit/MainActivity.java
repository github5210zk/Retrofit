package cn.bgs.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import cn.bgs.retrofit.bean.GetBean;
import cn.bgs.retrofit.bean.PostBean;
import cn.bgs.retrofit.r.PostService;
import cn.bgs.retrofit.r1.GetService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit谷歌官方详解 - CSDN博客  http://blog.csdn.net/sw5131899/article/details/53841907
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        initGet();
      initPost();
    }

    private void initPost()  {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService service = retrofit.create(PostService.class);
//        Call<PostBean> call = service.postString(new PostService.BodyUser("shehui", "d05b58fa6901ad9bed77a1ef08bd6ccb"));

                Call<PostBean> call = service.postString2("历史", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        //解决中文乱码，服务器后台不认识造成数据为响应
        //        String name =  URLEncoder.encode("社会","UTF-8");
        //        Call<PostBean> call = service.postString2(name, "d05b58fa6901ad9bed77a1ef08bd6ccb");

        //        Call<PostBean> call = service.postString3("社会", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        call.enqueue(new Callback<PostBean>() {
            @Override
            public void onResponse(Call<PostBean> call, Response<PostBean> response) {
                if (response.isSuccessful()) {
                    PostBean s1 = response.body();
                    Log.e("zhoukang", "R1++" + s1.toString());
                }
            }

            @Override
            public void onFailure(Call<PostBean> call, Throwable t) {
                Log.e("zhoukang", "R1++ 失败" + t.getMessage());
            }
        });

        //        HashMap<String, String> map = new HashMap<>();
        //        map.put("type", "shehui");
        //        map.put("key", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        //        Call<ResponseBody> call = service.getPostString(map);
    }


    private void initGet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetService service = retrofit.create(GetService.class);
        //        Call<GetBean> call = service.getString();
        //        Call<GetBean> call = service.getString2("toutiao");
        Call<GetBean> call = service.getString3("toutiao", "shehui", "d05b58fa6901ad9bed77a1ef08bd6ccb");

        //        HashMap<String, String> map = new HashMap<>();
        //        map.put("type", "shehui");
        //        map.put("key", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        //        Call<GetBean> call = service.getString4("toutiao", map);
        call.enqueue(new Callback<GetBean>() {
            @Override
            public void onResponse(Call<GetBean> call, Response<GetBean> response) {
                GetBean s1 = response.body();
                Log.e("zhoukang", "R1++" + s1.toString());
            }

            @Override
            public void onFailure(Call<GetBean> call, Throwable t) {

            }
        });
    }

}
