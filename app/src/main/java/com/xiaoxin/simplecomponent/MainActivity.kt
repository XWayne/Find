package com.xiaoxin.simplecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.callback.NavCallback
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toHome(view: View) {
        navigation("/home/main")
    }

    fun toFind(view: View) {
        navigation("/find/main")
    }

    fun toCategory(view: View) {
        navigation("/category/main")
    }

    private fun navigation(path:String){
        ARouter.getInstance().build(path).navigation(this, object : NavCallback() {
            override fun onLost(postcard: Postcard?) {
                Toast.makeText(this@MainActivity.applicationContext, "功能开发中...", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onArrival(postcard: Postcard?) {
            }
        })
    }
}