package cmcc.com.jzfp;

import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

import cmcc.com.basemodel.BaseApp;

/**
 * @author guandongchen
 * @date 2019/1/3
 */
public class APP extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("APP","APP-----------");
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();
        ARouter.init(this);

    }
}
