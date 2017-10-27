package dmitriy.deomin.myapplication.vidgets


import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.TextView
import dmitriy.deomin.myapplication.MainActivity.Companion.face


class Label : TextView {

    //конструкторы нужны обязаловкой иначе не фурычит
    constructor(ctx: Context) : super(ctx) {}
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs) {}

    override fun onDraw(canvas: Canvas?) {
        this.typeface = face
        super.onDraw(canvas)
    }

}
