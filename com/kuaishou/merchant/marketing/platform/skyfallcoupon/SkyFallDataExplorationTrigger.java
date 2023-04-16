package com.kuaishou.merchant.marketing.platform.skyfallcoupon.SkyFallDataExplorationTrigger;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SkyFallDataExplorationTrigger extends Enum	// class@001b34
{
    public static final SkyFallDataExplorationTrigger[] $VALUES;
    public static final SkyFallDataExplorationTrigger COUPON_CENTER;
    public static final SkyFallDataExplorationTrigger DELAY_SIGNAL;
    public static final SkyFallDataExplorationTrigger MATERIAL_INIT;
    public static final SkyFallDataExplorationTrigger SIGNAL_MATERIAL;

    static {
       SkyFallDataExplorationTrigger skyFallDataE = new SkyFallDataExplorationTrigger("DELAY_SIGNAL", 0);
       SkyFallDataExplorationTrigger.DELAY_SIGNAL = skyFallDataE;
       SkyFallDataExplorationTrigger skyFallDataE1 = new SkyFallDataExplorationTrigger("MATERIAL_INIT", 1);
       SkyFallDataExplorationTrigger.MATERIAL_INIT = skyFallDataE1;
       SkyFallDataExplorationTrigger skyFallDataE2 = new SkyFallDataExplorationTrigger("SIGNAL_MATERIAL", 2);
       SkyFallDataExplorationTrigger.SIGNAL_MATERIAL = skyFallDataE2;
       SkyFallDataExplorationTrigger skyFallDataE3 = new SkyFallDataExplorationTrigger("COUPON_CENTER", 3);
       SkyFallDataExplorationTrigger.COUPON_CENTER = skyFallDataE3;
       SkyFallDataExplorationTrigger[] skyFallDataE4 = new SkyFallDataExplorationTrigger[]{skyFallDataE,skyFallDataE1,skyFallDataE2,skyFallDataE3};
       SkyFallDataExplorationTrigger.$VALUES = skyFallDataE4;
    }
    public void SkyFallDataExplorationTrigger(String p0,int p1){
       super(p0, p1);
    }
    public static SkyFallDataExplorationTrigger valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SkyFallDataExplorationTrigger.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SkyFallDataExplorationTrigger.class, p0);
    }
    public static SkyFallDataExplorationTrigger[] values(){
       Object obj = PatchProxy.apply(null, null, SkyFallDataExplorationTrigger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SkyFallDataExplorationTrigger.$VALUES.clone();
    }
}
