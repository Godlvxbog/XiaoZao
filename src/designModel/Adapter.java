package designModel;

/**
 * Created by xbog on 2017/8/11.
 * 其實就是淺淺的封裝了一個類似的
 * 樂視使用的interface進行
 * 間接調用特殊的類的方法
 */
// 适配器类，继承了被适配类，同时实现标准接口
class Adapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}

