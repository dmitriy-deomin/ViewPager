package dmitriy.deomin.myapplication

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.page_abaut.view.*

class PageAbaut : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val v:View =  inflater!!.inflate(R.layout.page_abaut, null)

        val t:String = getString(R.string.app_name)+": "+getString(R.string.versionName)+"\n"+ getString(R.string.abaut_info_text)
        v.label_abaut.text = t

        //v.imageButton.setOnClickListener { open_gruppa() }
        v.imageButton.setOnClickListener {
            val i: Intent =  Intent("signal_dla_view_pagera")
            i.putExtra("number",0)
            context.sendBroadcast(i)

        }

        return v
    }

    private fun open_gruppa() {
        val browseIntent = Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.gruppa_vk)))
        startActivity(browseIntent)
    }


}