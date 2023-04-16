package com.yxcorp.gifshow.detail.plc.PlcPhotoType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlcPhotoType extends Enum	// class@001658
{
    public static final PlcPhotoType[] $VALUES;
    public static final PlcPhotoType ATLAS;
    public static final PlcPhotoType LONG_ATLAS;
    public static final PlcPhotoType SINGLE_IMAGE;
    public static final PlcPhotoType VIDEO;

    static {
       PlcPhotoType plcPhotoType = new PlcPhotoType("VIDEO", 0);
       PlcPhotoType.VIDEO = plcPhotoType;
       PlcPhotoType plcPhotoType1 = new PlcPhotoType("ATLAS", 1);
       PlcPhotoType.ATLAS = plcPhotoType1;
       PlcPhotoType plcPhotoType2 = new PlcPhotoType("LONG_ATLAS", 2);
       PlcPhotoType.LONG_ATLAS = plcPhotoType2;
       PlcPhotoType plcPhotoType3 = new PlcPhotoType("SINGLE_IMAGE", 3);
       PlcPhotoType.SINGLE_IMAGE = plcPhotoType3;
       PlcPhotoType[] plcPhotoType4 = new PlcPhotoType[]{plcPhotoType,plcPhotoType1,plcPhotoType2,plcPhotoType3};
       PlcPhotoType.$VALUES = plcPhotoType4;
    }
    public void PlcPhotoType(String p0,int p1){
       super(p0, p1);
    }
    public static PlcPhotoType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlcPhotoType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlcPhotoType.class, p0);
    }
    public static PlcPhotoType[] values(){
       Object obj = PatchProxy.apply(null, null, PlcPhotoType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlcPhotoType.$VALUES.clone();
    }
}
