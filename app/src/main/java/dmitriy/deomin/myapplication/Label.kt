package dmitriy.deomin.myapplication


import android.content.Context
import android.graphics.Canvas
import android.widget.TextView
import dmitriy.deomin.myapplication.MainActivity.Companion.face

/**
 * Created by dimon on 11.09.2017.
 */
class Label(context: Context?) : TextView(context) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        this.typeface = face
    }
}