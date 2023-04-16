package com.yxcorp.gifshow.growth.deviceinfo.DeviceInfoHelper$logger$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.deviceinfo.DeviceInfoHelper$logger$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DeviceInfoHelper$logger$2 extends Lambda implements a	// class@001366
{
    public static final DeviceInfoHelper$logger$2 INSTANCE;

    static {
       DeviceInfoHelper$logger$2.INSTANCE = new DeviceInfoHelper$logger$2();
    }
    public void DeviceInfoHelper$logger$2(){
       super(0);
    }
    public final DeviceInfoHelper$logger$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, DeviceInfoHelper$logger$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DeviceInfoHelper$logger$2$a("KuaishouDeviceInfo");
    }
    public Object invoke(){
       return this.invoke();
    }
}
