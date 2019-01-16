package guandong.com.mettingmodel;

import android.util.Log;

import guandong.com.basemodel.BaseApp;

/**
 * @author guandongchen
 * @date 2019/1/4
 */
public class MettingApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MettingApp","MettingApp-----------");
    }

    private static final MettingApp ourInstance = new MettingApp();

    static BaseApp getInstance() {
        Log.d("MettingApp","MettingApp-----------");
        return ourInstance;
    }

    protected MettingApp() {
        Log.d("MettingApp","MettingApp-----------");
    }
}
