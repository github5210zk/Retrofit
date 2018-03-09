package cn.bgs.retrofit.utils;

/**
 * Created by Administrator on 2017/12/11.
 */

public class RefrofitUtil {


    // TODO  ： 1.Retrofit2 的baseUlr 必须以 /（斜线） 结束，
    // 不然会抛出一个IllegalArgumentException,所以如果你看到别的教程没有以 / 结束，
    // 那么多半是直接从Retrofit 1.X 照搬过来的。
    //TODO : 2.上面的 注1 应该描述为 baseUrl 中的路径(path)必须以 / 结束，
    // 因为有些特殊情况可以不以/结尾

//    public String getRequest() {
//        final String[] string = new String[1];
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://v.juhe.cn/toutiao/")
//                .build();
//        PostService service = retrofit.create(PostService.class);
//        Call<ResponseBody> call = service.postString();
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    string[0] = response.body().string();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });
//        return string[0];
//    }



}
