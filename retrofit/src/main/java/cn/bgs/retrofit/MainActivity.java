package cn.bgs.retrofit;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

import cn.bgs.retrofit.bean.GetBean;
import cn.bgs.retrofit.bean.PostBean;
import cn.bgs.retrofit.postrequst.PostService;
import cn.bgs.retrofit.getrequest.GetService;
import cn.bgs.retrofit.utils.RetrofitHelper;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * https://blog.csdn.net/carson_ho/article/details/73732076
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = findViewById(R.id.tv);
        //        initGet();
        try {
            initPost();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //            initUpateBitmap();
        //            initUpateBitmap2();

    }

    /**
     * 单张图片上传
     *
     * @throws IOException
     */
    private void initUpateBitmap() {

        //获取图片路径,这只是个简单的例子，项目开发中会有很多图片需要上传，一般从相册和相机里获取，并且保存到后台服务器时必须自己定义名字
        // ，这样就不会发生图片替换（原因名字重复）
        File file = new File(Environment.getExternalStorageDirectory() + "/" + "retrofit/" + "ceshi.jpg");
        RequestBody body = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        RetrofitHelper.getInstance().uploadFile(body, new RetrofitHelper.OnSuccessListener() {
            @Override
            public void onSuccess(Object o) {
                Log.e("", "成功");
            }

            @Override
            public void onFaile() {
                Log.e("", "失败");

            }
        });


    }

    /**
     * 多张图片上传
     */
    private void initUpateBitmap2() {

        //获取图片路径,这只是个简单的例子，项目开发中会有很多图片需要上传，一般从相册和相机里获取，并且保存到后台服务器时必须自己定义名字
        // ，这样就不会发生图片替换（原因名字重复）
        File file = new File(Environment.getExternalStorageDirectory() + "/" + "retrofit/" + "ceshi.jpg");
        File file2 = new File(Environment.getExternalStorageDirectory() + "/" + "retrofit/" + "ceshi2.jpg");
        File file3 = new File(Environment.getExternalStorageDirectory() + "/" + "retrofit/" + "ceshi3.jpg");
        File file4 = new File(Environment.getExternalStorageDirectory() + "/" + "retrofit/" + "ceshi4.jpg");

        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), file);
        RequestBody requestBody2 = RequestBody.create(MediaType.parse("multipart/form-data"), file2);
        RequestBody requestBody3 = RequestBody.create(MediaType.parse("multipart/form-data"), file3);
        RequestBody requestBody4 = RequestBody.create(MediaType.parse("multipart/form-data"), file4);
        RequestBody body = RequestBody.create(MediaType.parse("multipart/form-data"), file);

        String name = "photo\"; filename=\"ceshi.jpg\"";
        String name2 = "photo\"; filename=\"ceshi2.jpg\"";
        String name3 = "photo\"; filename=\"ceshi3.jpg\"";
        String name4 = "photo\"; filename=\"ceshi4.jpg\"";
        HashMap<String, RequestBody> map = new HashMap<>();
        map.put(name, requestBody);
        map.put(name2, requestBody2);
        map.put(name3, requestBody3);
        map.put(name4, requestBody4);


        RetrofitHelper.getInstance().uploadFile2(map, new RetrofitHelper.OnSuccessListener() {
            @Override
            public void onSuccess(Object o) {
                Log.e("", "成功");
            }

            @Override
            public void onFaile() {
                Log.e("", "失败");

            }
        });
    }

    private void initPost() throws UnsupportedEncodingException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService service = retrofit.create(PostService.class);
        //解决中文乱码，服务器后台不认识造成数据为响应
        String name = URLEncoder.encode("社会", "UTF-8");
        HashMap<String, String> map = new HashMap<>();
        map.put("type", name);
        map.put("key", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        Call<PostBean> call = service.postString2(map);

        call.enqueue(new Callback<PostBean>() {
            @Override
            public void onResponse(Call<PostBean> call, Response<PostBean> response) {
                if (response.isSuccessful()) {
                    PostBean bean = response.body();
                    Message msg = hand.obtainMessage();
                    msg.obj = bean.toString();
                    msg.what = 102;
                    hand.sendMessage(msg);
                    Log.e("zhoukang", "" + bean.toString());
                }
            }

            @Override
            public void onFailure(Call<PostBean> call, Throwable t) {
                Log.e("zhoukang", "R1++ 失败" + t.getMessage());
            }
        });


    }


    private void initGet() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetService service = retrofit.create(GetService.class);
        final Call<GetBean> call = service.getString3("toutiao", "shehui", "d05b58fa6901ad9bed77a1ef08bd6ccb");
        //异步请求操作
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response<GetBean> execute = call.execute();
                    GetBean bean = execute.body();
                    Message msg = hand.obtainMessage();
                    msg.obj = bean.toString();
                    msg.what = 102;
                    hand.sendMessage(msg);
                    Log.e("zhoukang", "" + bean.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    Handler hand = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            //TODO 处理逻辑
            if (msg.what == 102) {
                String result = (String) msg.obj;
                mTv.setText(result);
            }
        }
    };

}
