package com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationEnvError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SkyFallDataExplorationEnvError extends Enum	// class@001b31
{
    public static final SkyFallDataExplorationEnvError[] $VALUES;
    public static final SkyFallDataExplorationEnvError LIVE_EXIT;
    public static final SkyFallDataExplorationEnvError SAME_COUPON;
    public static final SkyFallDataExplorationEnvError TRUST_HALF_SHOWING;

    static {
       SkyFallDataExplorationEnvError skyFallDataE = new SkyFallDataExplorationEnvError("SAME_COUPON", 0);
       SkyFallDataExplorationEnvError.SAME_COUPON = skyFallDataE;
       SkyFallDataExplorationEnvError skyFallDataE1 = new SkyFallDataExplorationEnvError("TRUST_HALF_SHOWING", 1);
       SkyFallDataExplorationEnvError.TRUST_HALF_SHOWING = skyFallDataE1;
       SkyFallDataExplorationEnvError skyFallDataE2 = new SkyFallDataExplorationEnvError("LIVE_EXIT", 2);
       SkyFallDataExplorationEnvError.LIVE_EXIT = skyFallDataE2;
       SkyFallDataExplorationEnvError[] skyFallDataE3 = new SkyFallDataExplorationEnvError[]{skyFallDataE,skyFallDataE1,skyFallDataE2};
       SkyFallDataExplorationEnvError.$VALUES = skyFallDataE3;
    }
    public void SkyFallDataExplorationEnvError(String p0,int p1){
       super(p0, p1);
    }
    public static SkyFallDataExplorationEnvError valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SkyFallDataExplorationEnvError.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SkyFallDataExplorationEnvError.class, p0);
    }
    public static SkyFallDataExplorationEnvError[] values(){
       Object obj = PatchProxy.apply(null, null, SkyFallDataExplorationEnvError.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SkyFallDataExplorationEnvError.$VALUES.clone();
    }
}
