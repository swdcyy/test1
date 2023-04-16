package com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$DisableCause;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UltraWideAndSuperStabilityStateHelper$DisableCause extends Enum	// class@000fa5
{
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause[] $VALUES;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_BEAUTY;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_BODY;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_FRONT_CAMERA;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_LOWLIGHTBOOST;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_MAGIC;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_MAKEUP;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_STABILITY;
    public static final UltraWideAndSuperStabilityStateHelper$DisableCause DISABLE_CAUSE_WIDE;

    static {
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_MAGIC", 0);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAGIC = uDisableCaus;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus1 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_LOWLIGHTBOOST", 1);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_LOWLIGHTBOOST = uDisableCaus1;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus2 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_FRONT_CAMERA", 2);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_FRONT_CAMERA = uDisableCaus2;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus3 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_STABILITY", 3);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_STABILITY = uDisableCaus3;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus4 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_WIDE", 4);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_WIDE = uDisableCaus4;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus5 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_BODY", 5);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_BODY = uDisableCaus5;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus6 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_BEAUTY", 6);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_BEAUTY = uDisableCaus6;
       UltraWideAndSuperStabilityStateHelper$DisableCause uDisableCaus7 = new UltraWideAndSuperStabilityStateHelper$DisableCause("DISABLE_CAUSE_MAKEUP", 7);
       UltraWideAndSuperStabilityStateHelper$DisableCause.DISABLE_CAUSE_MAKEUP = uDisableCaus7;
       UltraWideAndSuperStabilityStateHelper$DisableCause[] uDisableCaus8 = new UltraWideAndSuperStabilityStateHelper$DisableCause[]{uDisableCaus,uDisableCaus1,uDisableCaus2,uDisableCaus3,uDisableCaus4,uDisableCaus5,uDisableCaus6,uDisableCaus7};
       UltraWideAndSuperStabilityStateHelper$DisableCause.$VALUES = uDisableCaus8;
    }
    public void UltraWideAndSuperStabilityStateHelper$DisableCause(String p0,int p1){
       super(p0, p1);
    }
    public static UltraWideAndSuperStabilityStateHelper$DisableCause valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UltraWideAndSuperStabilityStateHelper$DisableCause.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UltraWideAndSuperStabilityStateHelper$DisableCause.class, p0);
    }
    public static UltraWideAndSuperStabilityStateHelper$DisableCause[] values(){
       Object obj = PatchProxy.apply(null, null, UltraWideAndSuperStabilityStateHelper$DisableCause.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UltraWideAndSuperStabilityStateHelper$DisableCause.$VALUES.clone();
    }
}
