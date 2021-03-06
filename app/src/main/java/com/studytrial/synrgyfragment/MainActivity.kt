package com.studytrial.synrgyfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()
        vp_content.adapter = PagerAdapter(supportFragmentManager)
        tl_main.setupWithViewPager(vp_content)
    }
}