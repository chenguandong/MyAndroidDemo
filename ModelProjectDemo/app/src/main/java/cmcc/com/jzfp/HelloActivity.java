package cmcc.com.jzfp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import org.greenrobot.eventbus.EventBus;

@Route(path = "/ttt/activity")
public class HelloActivity extends AppCompatActivity {
    @Autowired
    public String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_hello);
        findViewById(R.id.helloButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post("EventBus Success");
                finish();
            }
        });
        ((TextView)findViewById(R.id.helloTextView)).setText(name);
    }
}
