package com.kwai.sdk.kbar.qrdetection.KBarConfig$DeviceOrientation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KBarConfig$DeviceOrientation extends Enum	// class@001623
{
    public final int val;
    public static final KBarConfig$DeviceOrientation[] $VALUES;
    public static final KBarConfig$DeviceOrientation DEVICE_ORIENTATION_LANDSCAPE;
    public static final KBarConfig$DeviceOrientation DEVICE_ORIENTATION_PORTRAIT;

    static {
       KBarConfig$DeviceOrientation uDeviceOrien = new KBarConfig$DeviceOrientation("DEVICE_ORIENTATION_PORTRAIT", 0, 0);
       KBarConfig$DeviceOrientation.DEVICE_ORIENTATION_PORTRAIT = uDeviceOrien;
       KBarConfig$DeviceOrientation uDeviceOrien1 = new KBarConfig$DeviceOrientation("DEVICE_ORIENTATION_LANDSCAPE", 1, 1);
       KBarConfig$DeviceOrientation.DEVICE_ORIENTATION_LANDSCAPE = uDeviceOrien1;
       KBarConfig$DeviceOrientation[] uDeviceOrien2 = new KBarConfig$DeviceOrientation[]{uDeviceOrien,uDeviceOrien1};
       KBarConfig$DeviceOrientation.$VALUES = uDeviceOrien2;
    }
    public void KBarConfig$DeviceOrientation(String p0,int p1,int p2){
       super(p0, p1);
       this.val = p2;
    }
    public static KBarConfig$DeviceOrientation valueOf(String p0){
       return Enum.valueOf(KBarConfig$DeviceOrientation.class, p0);
    }
    public static KBarConfig$DeviceOrientation[] values(){
       return KBarConfig$DeviceOrientation.$VALUES.clone();
    }
    public int val(){
       return this.val;
    }
}
