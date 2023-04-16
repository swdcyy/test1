package com.yxcorp.gifshow.growth.vfc.model.VfcActivityType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class VfcActivityType extends Enum	// class@0015c5
{
    public static final VfcActivityType[] $VALUES;
    public static final VfcActivityType ASSIST_FISSION;
    public static final VfcActivityType FOLLOW_FISSION;

    static {
       VfcActivityType vfcActivityT1;
       VfcActivityType[] vfcActivityT = new VfcActivityType[]{vfcActivityT1,vfcActivityT1};
       vfcActivityT1 = new VfcActivityType("FOLLOW_FISSION", 0);
       VfcActivityType.FOLLOW_FISSION = vfcActivityT1;
       vfcActivityT1 = new VfcActivityType("ASSIST_FISSION", 1);
       VfcActivityType.ASSIST_FISSION = vfcActivityT1;
       VfcActivityType.$VALUES = vfcActivityT;
    }
    public void VfcActivityType(String p0,int p1){
       super(p0, p1);
    }
    public static VfcActivityType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VfcActivityType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(VfcActivityType.class, p0);
    }
    public static VfcActivityType[] values(){
       Object obj = PatchProxy.apply(null, null, VfcActivityType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VfcActivityType.$VALUES.clone();
    }
}
