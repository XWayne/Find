package com.xiaoxin.service_find

import com.alibaba.android.arouter.launcher.ARouter

/**
 * @author John
 */
object FindServiceUtil {

    fun getService(): IFindService =
        ARouter.getInstance().build(FindRouterTable.PATH_SERVICE_FIND).navigation() as IFindService
}