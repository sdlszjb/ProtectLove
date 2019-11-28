package com.protect.love

import android.content.Context
import android.R.attr.versionCode
import android.content.pm.PackageInfo
import com.protect.love.xp.log


object MMconfig {
    var netCore = ""
    var netMethod = ""
    var msgClzz = ""
    var netCoreMethod = ""

    fun init(context: Context, block: (Boolean) -> Unit) {
        val info = context.packageManager.getPackageInfo(context.packageName, 0)
        val versionName = info.versionName
        log("微信版本:$versionName")
        when (versionName) {
            "7.0.8" -> {
                netCore = "com.tencent.mm.model.az"
                netMethod = "aap"
                msgClzz = "com.tencent.mm.modelmulti.h"
                netCoreMethod = "b"
                block(true)
            }
            "7.0.7" -> {
                netCore = "com.tencent.mm.model.az"
                netMethod = "ZS"
                msgClzz = "com.tencent.mm.modelmulti.h"
                netCoreMethod = "b"
                block(true)
            }
            else -> {
                block(false)
            }
        }

    }
}