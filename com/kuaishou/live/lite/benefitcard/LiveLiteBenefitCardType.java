package com.kuaishou.live.lite.benefitcard.LiveLiteBenefitCardType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBenefitCardType extends Enum	// class@001e90
{
    public static final LiveLiteBenefitCardType[] $VALUES;
    public static final LiveLiteBenefitCardType COMMON;
    public static final LiveLiteBenefitCardType MERCHANT_COMMODITY;
    public static final LiveLiteBenefitCardType MERCHANT_DY;
    public static final LiveLiteBenefitCardType UNKNOWN;

    static {
       LiveLiteBenefitCardType liveLiteBene1;
       LiveLiteBenefitCardType[] liveLiteBene = new LiveLiteBenefitCardType[]{liveLiteBene1,liveLiteBene1,liveLiteBene1,liveLiteBene1};
       liveLiteBene1 = new LiveLiteBenefitCardType("UNKNOWN", 0);
       LiveLiteBenefitCardType.UNKNOWN = liveLiteBene1;
       liveLiteBene1 = new LiveLiteBenefitCardType("COMMON", 1);
       LiveLiteBenefitCardType.COMMON = liveLiteBene1;
       liveLiteBene1 = new LiveLiteBenefitCardType("MERCHANT_COMMODITY", 2);
       LiveLiteBenefitCardType.MERCHANT_COMMODITY = liveLiteBene1;
       liveLiteBene1 = new LiveLiteBenefitCardType("MERCHANT_DY", 3);
       LiveLiteBenefitCardType.MERCHANT_DY = liveLiteBene1;
       LiveLiteBenefitCardType.$VALUES = liveLiteBene;
    }
    public void LiveLiteBenefitCardType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteBenefitCardType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteBenefitCardType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteBenefitCardType.class, p0);
    }
    public static LiveLiteBenefitCardType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteBenefitCardType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteBenefitCardType.$VALUES.clone();
    }
}
