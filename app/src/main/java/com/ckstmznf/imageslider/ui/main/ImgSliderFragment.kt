package com.ckstmznf.imageslider.ui.main

import android.os.Bundle
import com.ckstmznf.imageslider.R
import com.ckstmznf.imageslider.base.BaseFragment
import com.ckstmznf.imageslider.data.ImgSliderData
import com.ckstmznf.imageslider.databinding.FragmentImgSliderBinding

class ImgSliderFragment() : BaseFragment<FragmentImgSliderBinding>(R.layout.fragment_img_slider) {

    companion object{
        private const val KEY_ONBOARD = "onboard"

        @JvmStatic
        fun newInstance(imgData : ImgSliderData) = ImgSliderFragment().apply {
            arguments = Bundle().apply {
                putSerializable(KEY_ONBOARD, imgData)
            }
        }
    }



    override fun init() {
        arguments?.let {
            binding.imgData = it.getSerializable(KEY_ONBOARD) as ImgSliderData
        }
    }

}