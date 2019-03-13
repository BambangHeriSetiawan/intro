package com.simxid.into


import android.os.Bundle
import android.widget.Toast
import com.simxid.intro.app.IntroActivity
import com.simxid.intro.slide.FragmentSlide

class MainActivity : IntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        isFullscreen = true
        super.onCreate(savedInstanceState)

        addSlide(
            FragmentSlide.Builder()
            .background(R.color.colorPrimary).fragment(R.layout.intro_one)
            .canGoBackward(false)
            .canGoForward(true)
            .build())
        addSlide(FragmentSlide.Builder()
            .background(R.color.colorPrimary).fragment(R.layout.intro_two)
            .canGoBackward(true)
            .canGoForward(true)
            .build())
        addSlide(FragmentSlide.Builder()
            .background(R.color.colorPrimary).fragment(R.layout.intro_three)
            .canGoBackward(true)
            .canGoForward(true)
            .build())
        addSlide(FragmentSlide.Builder()
            .background(R.color.colorPrimary).fragment(R.layout.intro_four)
            .canGoBackward(true)
            .canGoForward(true)
            .build())
        isButtonBackVisible = false
    }

    fun toas(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
