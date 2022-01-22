package com.ckstmznf.imageslider.data

import java.io.Serializable

data class ImgSliderData(
    val imgSrc : Int,
    val title : String,
    val description : String,
) : Serializable
