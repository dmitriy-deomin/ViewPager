package dmitriy.deomin.myapplication

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater


class PageAbaut : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val result = inflater!!.inflate(R.layout.page_abaut, container, false)
        return result
    }

}