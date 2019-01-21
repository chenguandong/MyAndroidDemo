package cmcc.com.basemodel;

import android.app.Application;

/**
 * @author guandongchen
 * @date 2019/1/15
 */
public class BaseApp extends Application {
    private static final BaseApp ourInstance = new BaseApp();

    static BaseApp getInstance() {
        return ourInstance;
    }

    protected BaseApp() {
    }
}
