package com.ckstmznf.imageslider.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.ckstmznf.imageslider.R
import com.ckstmznf.imageslider.base.BaseActivity
import com.ckstmznf.imageslider.data.ImgSliderData
import com.ckstmznf.imageslider.databinding.ActivityMainBinding
import com.ckstmznf.imageslider.ui.all.ViewPagerAdapter

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = viewModel

        val fragments = initFragments()
        binding.vpMain.adapter = ViewPagerAdapter(this, fragments)
        binding.vpMain.offscreenPageLimit = fragments.size - 1
    }

    private fun initFragments() : List<Fragment>{
        return listOf(
            ImgSliderFragment.newInstance(
                ImgSliderData(R.drawable.edcan, "Hello World", "EDCAN의 로고이다.")
            ),
            ImgSliderFragment.newInstance(
                ImgSliderData(R.drawable.edcan, "EDCAN은 정말 최고야", "EDCAN의 로고이다.")
            ),
            ImgSliderFragment.newInstance(
                ImgSliderData(R.drawable.edcan, "사랑해요 EDCAN", "EDCAN의 로고이다.")
            ),
            ImgSliderFragment.newInstance(
                ImgSliderData(R.drawable.edcan, "EDCAN 쵝오", "EDCAN의 로고이다.")
            ),
            ImgSliderFragment.newInstance(
                ImgSliderData(R.drawable.edcan, "EDCAN은 죽지 않아", "EDCAN의 로고이다.")
            ),
        )
    }
}
