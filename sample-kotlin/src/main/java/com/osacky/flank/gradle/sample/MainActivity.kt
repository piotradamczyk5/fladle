package com.osacky.flank.gradle.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.osacky.flank.gradle.sample.kotlin.R

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}
