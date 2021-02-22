package com.xiaoxin.service_find

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * @author John
 */
interface IFindService : IProvider {
    fun getFindGroup(): List<String>
}