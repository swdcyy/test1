package com.kuaishou.merchant.api.live.service.LiveMerchantTopPendantService$TopPendantPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMerchantTopPendantService$TopPendantPriority extends Enum	// class@001573
{
    public static final LiveMerchantTopPendantService$TopPendantPriority[] $VALUES;
    public static final LiveMerchantTopPendantService$TopPendantPriority CHALLENGE_PROGRESS;
    public static final LiveMerchantTopPendantService$TopPendantPriority GINSENG_FRUIT;
    public static final LiveMerchantTopPendantService$TopPendantPriority LEFT_AUTHENTICATION;
    public static final LiveMerchantTopPendantService$TopPendantPriority NORMAL_TASK;
    public static final LiveMerchantTopPendantService$TopPendantPriority RIGHTS_GUARANTEE;
    public static final LiveMerchantTopPendantService$TopPendantPriority TRUTH_OR_DARE;
    public static final LiveMerchantTopPendantService$TopPendantPriority UNKNOWN;

    static {
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr = new LiveMerchantTopPendantService$TopPendantPriority("UNKNOWN", 0);
       LiveMerchantTopPendantService$TopPendantPriority.UNKNOWN = topPendantPr;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr1 = new LiveMerchantTopPendantService$TopPendantPriority("RIGHTS_GUARANTEE", 1);
       LiveMerchantTopPendantService$TopPendantPriority.RIGHTS_GUARANTEE = topPendantPr1;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr2 = new LiveMerchantTopPendantService$TopPendantPriority("NORMAL_TASK", 2);
       LiveMerchantTopPendantService$TopPendantPriority.NORMAL_TASK = topPendantPr2;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr3 = new LiveMerchantTopPendantService$TopPendantPriority("GINSENG_FRUIT", 3);
       LiveMerchantTopPendantService$TopPendantPriority.GINSENG_FRUIT = topPendantPr3;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr4 = new LiveMerchantTopPendantService$TopPendantPriority("CHALLENGE_PROGRESS", 4);
       LiveMerchantTopPendantService$TopPendantPriority.CHALLENGE_PROGRESS = topPendantPr4;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr5 = new LiveMerchantTopPendantService$TopPendantPriority("TRUTH_OR_DARE", 5);
       LiveMerchantTopPendantService$TopPendantPriority.TRUTH_OR_DARE = topPendantPr5;
       LiveMerchantTopPendantService$TopPendantPriority topPendantPr6 = new LiveMerchantTopPendantService$TopPendantPriority("LEFT_AUTHENTICATION", 6);
       LiveMerchantTopPendantService$TopPendantPriority.LEFT_AUTHENTICATION = topPendantPr6;
       LiveMerchantTopPendantService$TopPendantPriority[] topPendantPr7 = new LiveMerchantTopPendantService$TopPendantPriority[]{topPendantPr,topPendantPr1,topPendantPr2,topPendantPr3,topPendantPr4,topPendantPr5,topPendantPr6};
       LiveMerchantTopPendantService$TopPendantPriority.$VALUES = topPendantPr7;
    }
    public void LiveMerchantTopPendantService$TopPendantPriority(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMerchantTopPendantService$TopPendantPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMerchantTopPendantService$TopPendantPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMerchantTopPendantService$TopPendantPriority.class, p0);
    }
    public static LiveMerchantTopPendantService$TopPendantPriority[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMerchantTopPendantService$TopPendantPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMerchantTopPendantService$TopPendantPriority.$VALUES.clone();
    }
}
