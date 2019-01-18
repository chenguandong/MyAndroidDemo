package cmcc.com.newsmodel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import kotlinx.android.synthetic.main.activity_news_main.*

@Route(path = "/news/newsMain")
class NewsMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_main)
        newsTextView.text = "新闻主界面 Kotlin编写"
    }
}
