package com.kuaishou.ug.deviceinfo.DeviceInfoManager$lastBootTimestamp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import android.os.SystemClock;
import com.kuaishou.ug.deviceinfo.DeviceInfoManager;
import java.lang.Long;
import android.os.Bundle;

public final class DeviceInfoManager$lastBootTimestamp$2 extends Lambda implements a	// class@000953
{
    public static final DeviceInfoManager$lastBootTimestamp$2 INSTANCE;

    static {
       DeviceInfoManager$lastBootTimestamp$2.INSTANCE = new DeviceInfoManager$lastBootTimestamp$2();
    }
    public void DeviceInfoManager$lastBootTimestamp$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, DeviceInfoManager$lastBootTimestamp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = System.currentTimeMillis() - SystemClock.elapsedRealtime();
       DeviceInfoManager.l(DeviceInfoManager.d, "last_boot_time", Long.valueOf(l), null, 4, null);
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
