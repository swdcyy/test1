package com.kwai.framework.app.huaweisuperapp.HuaweiSuperAppPrelaunchStage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HuaweiSuperAppPrelaunchStage extends Enum	// class@000b12
{
    public static final HuaweiSuperAppPrelaunchStage[] $VALUES;
    public static final HuaweiSuperAppPrelaunchStage PRELAUNCHING;
    public static final HuaweiSuperAppPrelaunchStage PRELAUNCH_FINISH;
    public static final HuaweiSuperAppPrelaunchStage UNDEFINE;
    public static final HuaweiSuperAppPrelaunchStage USER_LAUNCH;

    static {
       HuaweiSuperAppPrelaunchStage huaweiSuperA = new HuaweiSuperAppPrelaunchStage("UNDEFINE", 0);
       HuaweiSuperAppPrelaunchStage.UNDEFINE = huaweiSuperA;
       HuaweiSuperAppPrelaunchStage huaweiSuperA1 = new HuaweiSuperAppPrelaunchStage("PRELAUNCHING", 1);
       HuaweiSuperAppPrelaunchStage.PRELAUNCHING = huaweiSuperA1;
       HuaweiSuperAppPrelaunchStage huaweiSuperA2 = new HuaweiSuperAppPrelaunchStage("PRELAUNCH_FINISH", 2);
       HuaweiSuperAppPrelaunchStage.PRELAUNCH_FINISH = huaweiSuperA2;
       HuaweiSuperAppPrelaunchStage huaweiSuperA3 = new HuaweiSuperAppPrelaunchStage("USER_LAUNCH", 3);
       HuaweiSuperAppPrelaunchStage.USER_LAUNCH = huaweiSuperA3;
       HuaweiSuperAppPrelaunchStage[] huaweiSuperA4 = new HuaweiSuperAppPrelaunchStage[]{huaweiSuperA,huaweiSuperA1,huaweiSuperA2,huaweiSuperA3};
       HuaweiSuperAppPrelaunchStage.$VALUES = huaweiSuperA4;
    }
    public void HuaweiSuperAppPrelaunchStage(String p0,int p1){
       super(p0, p1);
    }
    public static HuaweiSuperAppPrelaunchStage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HuaweiSuperAppPrelaunchStage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HuaweiSuperAppPrelaunchStage.class, p0);
    }
    public static HuaweiSuperAppPrelaunchStage[] values(){
       Object obj = PatchProxy.apply(null, null, HuaweiSuperAppPrelaunchStage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HuaweiSuperAppPrelaunchStage.$VALUES.clone();
    }
}
