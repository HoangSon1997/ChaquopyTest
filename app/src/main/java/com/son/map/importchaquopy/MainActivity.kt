package com.son.map.importchaquopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!Python.isStarted()) {
            Python.start(AndroidPlatform(this));
        }

//        try {
//            val py = Python.getInstance()
//
////            val module = py.getModule("script")
////            val num = module["num"]?.toInt()
////            Log.d("sondeptrai", "onCreate: $num")
//
//            val module = py.getModule("image_py")
//            val title = module["title"].toString()
//            Log.d("sondeptrai", "onCreate: $title")
//        } catch (ex: Exception) {
//            Log.d("sondeptrai", "onCreate: Python fail")
//        }

        val py = Python.getInstance()

            val module = py.getModule("script")
//            val num = module["num"]?.toInt()
//            Log.d("sondeptrai", "onCreate: $num")

//        val module = py.getModule("image_py")
//        val title = module["title"].toString()
//        Log.d("sondeptrai", "onCreate: $title")
    }
}