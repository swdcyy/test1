package com.yxcorp.gifshow.photoad.CommonCardType;
import java.lang.Enum;
import com.yxcorp.gifshow.photoad.CommonCardType$TACHIKOMA;
import java.lang.String;
import com.yxcorp.gifshow.photoad.CommonCardType$NATIVE;
import com.yxcorp.gifshow.photoad.CommonCardType$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public abstract class CommonCardType extends Enum	// class@000f59
{
    public static final CommonCardType[] $VALUES;
    public static final CommonCardType$a Companion;
    public static final CommonCardType NATIVE;
    public static final CommonCardType TACHIKOMA;

    static {
       CommonCardType$TACHIKOMA tACHIKOMA;
       CommonCardType$NATIVE nATIVE;
       CommonCardType[] uCommonCardT = new CommonCardType[]{tACHIKOMA,nATIVE};
       tACHIKOMA = new CommonCardType$TACHIKOMA("TACHIKOMA", 0);
       CommonCardType.TACHIKOMA = tACHIKOMA;
       nATIVE = new CommonCardType$NATIVE("NATIVE", 1);
       CommonCardType.NATIVE = nATIVE;
       CommonCardType.$VALUES = uCommonCardT;
       CommonCardType.Companion = new CommonCardType$a(null);
    }
    public void CommonCardType(String p0,int p1){
       super(p0, p1);
    }
    public void CommonCardType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static final boolean shouldUse(CommonCardType p0,QPhoto p1,boolean p2){
       if (PatchProxy.isSupport(CommonCardType.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, CommonCardType.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return CommonCardType.Companion.a(p0, p1, p2);
    }
    public static CommonCardType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommonCardType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommonCardType.class, p0);
    }
    public static CommonCardType[] values(){
       Object obj = PatchProxy.apply(null, null, CommonCardType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommonCardType.$VALUES.clone();
    }
    public abstract boolean valid(QPhoto p0);
}
