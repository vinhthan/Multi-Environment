package com.selex.testmultienvironment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    /**
     * tutorial
     * https://medium.com/easyfundraising-org-uk/setting-up-for-different-environments-in-android-studio-using-build-variants-product-756fdf8d47fb
     * */
    private fun c() {
        BuildConfig.BASE_URL
    }
}