package com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SkyFallDataExplorationError extends Enum	// class@001b32
{
    public static final SkyFallDataExplorationError[] $VALUES;
    public static final SkyFallDataExplorationError DATA_EMPTY;
    public static final SkyFallDataExplorationError NO_SKYFALL;
    public static final SkyFallDataExplorationError POPUP_STYLE_ERROR;
    public static final SkyFallDataExplorationError SHOW_TYPE_ERROR;
    public static final SkyFallDataExplorationError SKYFALL_EXPIRED;
    public static final SkyFallDataExplorationError SKYFALL_RECIVED;

    static {
       SkyFallDataExplorationError skyFallDataE = new SkyFallDataExplorationError("DATA_EMPTY", 0);
       SkyFallDataExplorationError.DATA_EMPTY = skyFallDataE;
       SkyFallDataExplorationError skyFallDataE1 = new SkyFallDataExplorationError("NO_SKYFALL", 1);
       SkyFallDataExplorationError.NO_SKYFALL = skyFallDataE1;
       SkyFallDataExplorationError skyFallDataE2 = new SkyFallDataExplorationError("SHOW_TYPE_ERROR", 2);
       SkyFallDataExplorationError.SHOW_TYPE_ERROR = skyFallDataE2;
       SkyFallDataExplorationError skyFallDataE3 = new SkyFallDataExplorationError("POPUP_STYLE_ERROR", 3);
       SkyFallDataExplorationError.POPUP_STYLE_ERROR = skyFallDataE3;
       SkyFallDataExplorationError skyFallDataE4 = new SkyFallDataExplorationError("SKYFALL_EXPIRED", 4);
       SkyFallDataExplorationError.SKYFALL_EXPIRED = skyFallDataE4;
       SkyFallDataExplorationError skyFallDataE5 = new SkyFallDataExplorationError("SKYFALL_RECIVED", 5);
       SkyFallDataExplorationError.SKYFALL_RECIVED = skyFallDataE5;
       SkyFallDataExplorationError[] skyFallDataE6 = new SkyFallDataExplorationError[]{skyFallDataE,skyFallDataE1,skyFallDataE2,skyFallDataE3,skyFallDataE4,skyFallDataE5};
       SkyFallDataExplorationError.$VALUES = skyFallDataE6;
    }
    public void SkyFallDataExplorationError(String p0,int p1){
       super(p0, p1);
    }
    public static SkyFallDataExplorationError valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SkyFallDataExplorationError.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SkyFallDataExplorationError.class, p0);
    }
    public static SkyFallDataExplorationError[] values(){
       Object obj = PatchProxy.apply(null, null, SkyFallDataExplorationError.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SkyFallDataExplorationError.$VALUES.clone();
    }
}
