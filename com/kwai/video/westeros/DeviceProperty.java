package com.kwai.video.westeros.DeviceProperty;
import java.lang.Object;
import java.lang.String;
import android.os.Build;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.GPUPerformance;

public class DeviceProperty	// class@000e5c
{

    public void DeviceProperty(){
       super();
    }
    public static String getDeviceBrandName(){
       return Build.BRAND;
    }
    public static int getDeviceGPUScore(){
       Object obj = PatchProxy.apply(null, null, DeviceProperty.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return GPUPerformance.getDeviceGPUScore();
    }
    public static String getDeviceModelName(){
       return Build.MODEL;
    }
    public static String getDeviceRenderer(){
       Object obj = PatchProxy.apply(null, null, DeviceProperty.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GPUPerformance.getRenderer();
    }
}
