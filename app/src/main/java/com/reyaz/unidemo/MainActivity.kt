package com.reyaz.unidemo

import android.content.res.Resources
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.reyaz.unidemo.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        initUi()
        initListeners()
    }

    private fun initListeners() {
        binding.mainHeader.hamburger.setOnClickListener {
            if (binding.expandableView.root.visibility == View.VISIBLE) {
                binding.expandableView.root.visibility = View.GONE
            } else {
                binding.expandableView.root.visibility = View.VISIBLE
            }
        }
    }

    private fun initUi() {
        val lp = binding.homePageOne.root.layoutParams
        lp.height = getScreenHeight() - 200
        binding.homePageOne.root.layoutParams = lp

        val lp2 = binding.homePageTwo.root.layoutParams
        lp2.height = getScreenHeight() - 200
        binding.homePageTwo.root.layoutParams = lp2

        val lp3 = binding.homePageThree.root.layoutParams
        lp3.height = getScreenHeight() - 200
        binding.homePageThree.root.layoutParams = lp2

        val lp4 = binding.homePageFour.root.layoutParams
        lp4.height = getScreenHeight() - 200
        binding.homePageFour.root.layoutParams = lp4

        val lp5 = binding.homePageFour.root.layoutParams
        lp5.height = getScreenHeight() - 200
        binding.homePageFour.root.layoutParams = lp5
    }

    private fun getScreenHeight(): Int {
        return Resources.getSystem().displayMetrics.heightPixels
    }
}
