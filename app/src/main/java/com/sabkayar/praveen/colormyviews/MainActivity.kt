package com.sabkayar.praveen.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sabkayar.praveen.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setListeners()

    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                mBinding.boxOneText, mBinding.boxTwoText, mBinding.boxThreeText
                , mBinding.boxFourText, mBinding.boxFiveText, mBinding.constraintLayout,
                mBinding.redButton, mBinding.greenButton, mBinding.yellowButton
            )
        for (item in clickableViews)
            item.setOnClickListener() {
                makeColored(it)
            }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            // Boxes using custom colors for background
            R.id.red_button -> mBinding.boxThreeText.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> mBinding.boxFourText.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> mBinding.boxFiveText.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}