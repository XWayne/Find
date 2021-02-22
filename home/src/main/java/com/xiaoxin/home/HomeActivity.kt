package com.xiaoxin.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.xiaoxin.service_find.FindServiceUtil

@Route(path = "/home/main")
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        FindServiceUtil.getService().getFindGroup().joinToString(separator = ";").let {
            findViewById<TextView>(R.id.tv_find_category).text = it
        }
    }
}