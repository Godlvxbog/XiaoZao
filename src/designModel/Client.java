package designModel;

/**
 * Created by xbog on 2017/8/11.
 */
public class Client {

    public static void main(String[] args) {
        // 使用特殊功能类，即适配类
        Target adapter = new Adapter();
        adapter.request();
    }


}
