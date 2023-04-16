package com.kuaishou.live.common.multiinteract.appearance.DeviceOrientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DeviceOrientation extends Enum	// class@0017e1
{
    public static final DeviceOrientation[] $VALUES;
    public static final DeviceOrientation ANY;
    public static final DeviceOrientation LANDSCAPE;
    public static final DeviceOrientation PORTRAIT;

    static {
       DeviceOrientation uDeviceOrien1;
       DeviceOrientation[] uDeviceOrien = new DeviceOrientation[]{uDeviceOrien1,uDeviceOrien1,uDeviceOrien1};
       uDeviceOrien1 = new DeviceOrientation("LANDSCAPE", 0);
       DeviceOrientation.LANDSCAPE = uDeviceOrien1;
       uDeviceOrien1 = new DeviceOrientation("PORTRAIT", 1);
       DeviceOrientation.PORTRAIT = uDeviceOrien1;
       uDeviceOrien1 = new DeviceOrientation("ANY", 2);
       DeviceOrientation.ANY = uDeviceOrien1;
       DeviceOrientation.$VALUES = uDeviceOrien;
    }
    public void DeviceOrientation(String p0,int p1){
       super(p0, p1);
    }
    public static DeviceOrientation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DeviceOrientation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DeviceOrientation.class, p0);
    }
    public static DeviceOrientation[] values(){
       Object obj = PatchProxy.apply(null, null, DeviceOrientation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DeviceOrientation.$VALUES.clone();
    }
}
