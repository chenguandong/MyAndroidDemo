package cmcc.com.jzfp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;

import cmcc.com.mettingmodel.MettingActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MettingActivity.class));
            }
        });

        findViewById(R.id.buttonKotlin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/NewsModule/NewsMainActivity")
                        .withString("name","hello 新闻模块")
                        .navigation(MainActivity.this,666);
            }
        });

        findViewById(R.id.buttonDemo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ARouter.getInstance().build("/DemoModule/DemoMainActivity")
                        .navigation();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=RESULT_OK){
            return;
        }
        if (requestCode==666){
            String result = data.getStringExtra("data");
            Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
        }
    }
}
