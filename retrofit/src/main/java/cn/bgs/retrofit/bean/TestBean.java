package cn.bgs.retrofit.bean;

/**
 * Created by ${zk} on 2018/4/16 0016.
 * 欢迎每一天
 */

public class TestBean{
    String status,info;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public TestBean(String status, String info) {
        this.status = status;
        this.info = info;
    }

    @Override
    public String toString() {
        return "UploadAvatarBean{" +
                "status='" + status + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}