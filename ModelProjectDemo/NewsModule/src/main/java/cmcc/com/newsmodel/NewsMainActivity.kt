package cmcc.com.newsmodel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import guandong.com.sharemodule.ShareTools
import kotlinx.android.synthetic.main.activity_news_main.*

@Route(path = "/news/newsMain")
class NewsMainActivity : AppCompatActivity() {
    @Autowired
    @JvmField var name: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
        setContentView(R.layout.activity_news_main)
        newsTextView.text = name

        shareButton.setOnClickListener {
                ShareTools.showShareView(this)
        }
    }
}
