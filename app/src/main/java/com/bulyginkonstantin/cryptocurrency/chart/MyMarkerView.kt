package com.bulyginkonstantin.cryptocurrency.chart

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import com.bulyginkonstantin.cryptocurrency.R
import com.bulyginkonstantin.cryptocurrency.dateToString
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF

@SuppressLint("ViewConstructor")
class MyMarkerView(context: Context, layoutResource: Int) : MarkerView(context, layoutResource) {

    private val tvContent: TextView = findViewById(R.id.tvContent)

    // runs every time the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    override fun refreshContent(e: Entry, highlight: Highlight) {

        tvContent.text = e.y.toString() + "\n" + e.x.dateToString(context.getString(R.string.format))
        super.refreshContent(e, highlight)
    }

    override fun getOffset(): MPPointF {
        return MPPointF((-(width / 2)).toFloat(), (-height).toFloat())
    }
}