package com.kwai.video.devicepersona.DeviceConstant$SizeMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DeviceConstant$SizeMode extends Enum	// class@001b13
{
    public static final DeviceConstant$SizeMode[] $VALUES;
    public static final DeviceConstant$SizeMode K_1080;
    public static final DeviceConstant$SizeMode K_1080_2160;
    public static final DeviceConstant$SizeMode K_1440_2560;
    public static final DeviceConstant$SizeMode K_4K;
    public static final DeviceConstant$SizeMode K_540;
    public static final DeviceConstant$SizeMode K_720;

    static {
       DeviceConstant$SizeMode sizeMode = new DeviceConstant$SizeMode("K_540", 0);
       DeviceConstant$SizeMode.K_540 = sizeMode;
       DeviceConstant$SizeMode sizeMode1 = new DeviceConstant$SizeMode("K_720", 1);
       DeviceConstant$SizeMode.K_720 = sizeMode1;
       DeviceConstant$SizeMode sizeMode2 = new DeviceConstant$SizeMode("K_1080", 2);
       DeviceConstant$SizeMode.K_1080 = sizeMode2;
       DeviceConstant$SizeMode sizeMode3 = new DeviceConstant$SizeMode("K_1080_2160", 3);
       DeviceConstant$SizeMode.K_1080_2160 = sizeMode3;
       DeviceConstant$SizeMode sizeMode4 = new DeviceConstant$SizeMode("K_1440_2560", 4);
       DeviceConstant$SizeMode.K_1440_2560 = sizeMode4;
       DeviceConstant$SizeMode sizeMode5 = new DeviceConstant$SizeMode("K_4K", 5);
       DeviceConstant$SizeMode.K_4K = sizeMode5;
       DeviceConstant$SizeMode[] sizeModeArra = new DeviceConstant$SizeMode[]{sizeMode,sizeMode1,sizeMode2,sizeMode3,sizeMode4,sizeMode5};
       DeviceConstant$SizeMode.$VALUES = sizeModeArra;
    }
    public void DeviceConstant$SizeMode(String p0,int p1){
       super(p0, p1);
    }
    public static DeviceConstant$SizeMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DeviceConstant$SizeMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DeviceConstant$SizeMode.class, p0);
    }
    public static DeviceConstant$SizeMode[] values(){
       Object obj = PatchProxy.apply(null, null, DeviceConstant$SizeMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DeviceConstant$SizeMode.$VALUES.clone();
    }
}
