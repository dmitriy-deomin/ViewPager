package dmitriy.deomin.myapplication

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.view.View

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = pagerAdapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager

        pager.adapter = adapter
    }
}
