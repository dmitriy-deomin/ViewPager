package dmitriy.deomin.myapplication

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.view.View
import android.content.SharedPreferences
import android.text.Spannable
import android.graphics.Typeface


class MainActivity : FragmentActivity() {

    companion object {
        //шрифт
        var face: Typeface? = null
        //для текста
        var text: Spannable? = null
        //сохранялка
        var mSettings: SharedPreferences? = null // сохранялка
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSettings = getSharedPreferences("mysettings", MODE_PRIVATE)
        face = Typeface.createFromAsset(assets, if (save_read("fonts") == "") "fonts/Tweed.ttf" else save_read("fonts"))

        val adapter = pageradapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager

        pager.adapter = adapter
    }

    private fun save_read(key: String): String {
        if(mSettings!!.contains(key)){
            return mSettings!!.getString(key,"")
        }else{
            return ""
        }
    }

}
