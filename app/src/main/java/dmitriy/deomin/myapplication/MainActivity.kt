package dmitriy.deomin.myapplication

import android.content.*
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.view.View
import android.text.Spannable
import android.graphics.Typeface


class MainActivity : FragmentActivity() {

    //val - final
    //var - переменная


    companion object {
        //шрифт
        var face: Typeface? = null
        //для текста
        var text: Spannable? = null

        //сохранялка
        //----------------------------------------------------------------
        var settings: SharedPreferences? = null // сохранялка
        //чтение настроек
        fun read_str(key:String):String{ if(ne_pusto(key)){return settings!!.getString(key,"")}else{return ""} }
        fun ne_pusto(key:String):Boolean{return settings!!.contains(key)}
        //запись настроек
        fun save_str(key:String,value:String){ settings!!.edit().putString(key,value).apply() }
        //----------------------------------------------------------------

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        settings = getSharedPreferences("mysettings", FragmentActivity.MODE_PRIVATE)
        face = Typeface.createFromAsset(assets, if (read_str("fonts") == "") "fonts/Tweed.ttf" else read_str("fonts"))

        val adapter = pageradapter(supportFragmentManager)
        val viewpager = findViewById<View>(R.id.pager) as ViewPager

        viewpager.adapter = adapter
        viewpager.currentItem = 0


        //и будем слушать сигналы из космоса для смены страницы вьюпажера
        //***************************************************************************
        //фильтр для нашего сигнала из сервиса
        val intentFilter = IntentFilter()
        intentFilter.addAction("signal_dla_view_pagera")

        //приёмник  сигналов
        val broadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                viewpager.currentItem = intent.getIntExtra("number",0)
            }
        }
        //регистрируем приёмник
        registerReceiver(broadcastReceiver, intentFilter)
        //************************************************************************************

    }

}
