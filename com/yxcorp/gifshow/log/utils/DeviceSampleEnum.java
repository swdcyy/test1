package com.yxcorp.gifshow.log.utils.DeviceSampleEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DeviceSampleEnum extends Enum	// class@001b4f
{
    public static final DeviceSampleEnum[] $VALUES;
    public static final DeviceSampleEnum DEVICE_SAMPLE_HALF;
    public static final DeviceSampleEnum DEVICE_SAMPLE_HUNDREDTH;
    public static final DeviceSampleEnum DEVICE_SAMPLE_NONE;
    public static final DeviceSampleEnum DEVICE_SAMPLE_TENTH;
    public static final DeviceSampleEnum DEVICE_SAMPLE_TEN_THOUSANDTH;
    public static final DeviceSampleEnum DEVICE_SAMPLE_THOUSANDTH;

    static {
       DeviceSampleEnum uDeviceSampl = new DeviceSampleEnum("DEVICE_SAMPLE_NONE", 0);
       DeviceSampleEnum.DEVICE_SAMPLE_NONE = uDeviceSampl;
       DeviceSampleEnum uDeviceSampl1 = new DeviceSampleEnum("DEVICE_SAMPLE_TENTH", 1);
       DeviceSampleEnum.DEVICE_SAMPLE_TENTH = uDeviceSampl1;
       DeviceSampleEnum uDeviceSampl2 = new DeviceSampleEnum("DEVICE_SAMPLE_HALF", 2);
       DeviceSampleEnum.DEVICE_SAMPLE_HALF = uDeviceSampl2;
       DeviceSampleEnum uDeviceSampl3 = new DeviceSampleEnum("DEVICE_SAMPLE_HUNDREDTH", 3);
       DeviceSampleEnum.DEVICE_SAMPLE_HUNDREDTH = uDeviceSampl3;
       DeviceSampleEnum uDeviceSampl4 = new DeviceSampleEnum("DEVICE_SAMPLE_THOUSANDTH", 4);
       DeviceSampleEnum.DEVICE_SAMPLE_THOUSANDTH = uDeviceSampl4;
       DeviceSampleEnum uDeviceSampl5 = new DeviceSampleEnum("DEVICE_SAMPLE_TEN_THOUSANDTH", 5);
       DeviceSampleEnum.DEVICE_SAMPLE_TEN_THOUSANDTH = uDeviceSampl5;
       DeviceSampleEnum[] uDeviceSampl6 = new DeviceSampleEnum[]{uDeviceSampl,uDeviceSampl1,uDeviceSampl2,uDeviceSampl3,uDeviceSampl4,uDeviceSampl5};
       DeviceSampleEnum.$VALUES = uDeviceSampl6;
    }
    public void DeviceSampleEnum(String p0,int p1){
       super(p0, p1);
    }
    public static DeviceSampleEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DeviceSampleEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DeviceSampleEnum.class, p0);
    }
    public static DeviceSampleEnum[] values(){
       Object obj = PatchProxy.apply(null, null, DeviceSampleEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DeviceSampleEnum.$VALUES.clone();
    }
}
