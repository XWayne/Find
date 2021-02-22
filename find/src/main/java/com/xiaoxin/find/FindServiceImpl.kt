package com.xiaoxin.find

import android.content.Context
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.xiaoxin.service_find.FindRouterTable
import com.xiaoxin.service_find.IFindService

/**
 * @author John
 */
@Route(path = FindRouterTable.PATH_SERVICE_FIND)
class FindServiceImpl : IFindService {

    init {
        Log.e("John", "initImpl")
    }

    override fun getFindGroup(): List<String> = listOf("Android", "Kotlin", "Java")

    override fun init(context: Context?) {}
}