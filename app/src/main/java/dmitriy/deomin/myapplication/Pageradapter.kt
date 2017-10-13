package dmitriy.deomin.myapplication

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter


class pageradapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return PageHome()
            1 -> return PageAbaut()
        }
        return null
    }

    override fun getCount(): Int {
        return 2
    }
}