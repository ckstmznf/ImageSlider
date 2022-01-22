package com.ckstmznf.imageslider.ui.all

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("bindImgSrc")
fun bindImgSrc(v : ImageView, src : Int){
    v.setImageResource(src)
}
