package cmcc.com.mettingmodel;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MettingActivity extends AppCompatActivity implements View.OnClickListener {
    /**
     * 电话会议模块
     */
    private TextView mText;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metting);
        initView();
        EventBus.getDefault().register(this);
        mText = findViewById(R.id.text);
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/ttt/activity").withString("name","我是传参").navigation();

            }
        });
        Context context = MettingApp.getInstance();
        if (context instanceof Application) {
            String ss = "";
        } else {
            String ss = "";

        }

        Glide.with(this).load("https://i1.mifile.cn/a4/xmad_15471333544761_iIFgE.jpg").into(mImageView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(String event) {
        mText.setText(event);
    }

    private void initView() {
        mText = (TextView) findViewById(R.id.text);
        mText.setOnClickListener(this);
        mImageView = (ImageView) findViewById(R.id.imageView);
        mImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.text) {

        } else if (i == R.id.imageView) {

        } else {

        }
    }
}
