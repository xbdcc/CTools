package com.carlos.ctools.utils

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Created by Carlos on 2018/7/3.
 */
object LogUtils {

    fun getLogger(clazz: Class<*>): Logger {
        return LoggerFactory.getLogger(clazz)
    }
}