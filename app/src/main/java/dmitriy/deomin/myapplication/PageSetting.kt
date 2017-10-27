package dmitriy.deomin.myapplication


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dmitriy.deomin.myapplication.R

class PageSetting : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v: View =  inflater!!.inflate(R.layout.page_setting, null)

      //  fonts_btn.setOnClickListener{ }


        return v
    }



}