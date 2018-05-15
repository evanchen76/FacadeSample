package evan.chen.tutorial.facadesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //發送一個GA Screen：首頁
        val appTracker = AppTracker(this)
        appTracker.sendScreenTracker("首頁")

        //發送一個GA Event：點Button
        button.setOnClickListener {
            appTracker.sendEvent("分類", "點Button")
        }
    }
}
