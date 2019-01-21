package guandong.com.sharemodule;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * @author guandongchen
 * @date 2019/1/21
 */
public class ShareTools {
    public static void showShareView(Context context){
        new AlertDialog.Builder(context).setTitle("分享组件")
                .setNegativeButton("去掉", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).create().show();
    }
}
