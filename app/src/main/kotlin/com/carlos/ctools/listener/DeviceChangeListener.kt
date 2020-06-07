package com.carlos.ctools.listener

import com.android.ddmlib.AndroidDebugBridge
import com.android.ddmlib.IDevice

/**
 * Created by Carlos on 2018/7/3.
 */
interface DeviceChangeListener : AndroidDebugBridge.IDeviceChangeListener {
    override fun deviceChanged(p0: IDevice?, p1: Int) {
    }
}