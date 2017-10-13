package dmitriy.deomin.myapplication


import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.TextView
import dmitriy.deomin.myapplication.MainActivity.Companion.face

/**
 * Created by dimon on 11.09.2017.
 */
class Label : TextView {

    //конструкторы нужны обязаловкой иначе не фурычит
    constructor(ctx: Context) : super(ctx) {}
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs) {}

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        this.typeface = face
    }

}
