package com.kuaishou.live.core.show.profilecard.contentarea.LiveProfileContentAreaHeightService$ConfigPriority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveProfileContentAreaHeightService$ConfigPriority extends Enum	// class@000dbb
{
    public static final LiveProfileContentAreaHeightService$ConfigPriority[] $VALUES;
    public static final LiveProfileContentAreaHeightService$ConfigPriority Default;
    public static final LiveProfileContentAreaHeightService$ConfigPriority RevenueDelivery;

    static {
       LiveProfileContentAreaHeightService$ConfigPriority uConfigPrior = new LiveProfileContentAreaHeightService$ConfigPriority("Default", 0);
       LiveProfileContentAreaHeightService$ConfigPriority.Default = uConfigPrior;
       LiveProfileContentAreaHeightService$ConfigPriority uConfigPrior1 = new LiveProfileContentAreaHeightService$ConfigPriority("RevenueDelivery", 1);
       LiveProfileContentAreaHeightService$ConfigPriority.RevenueDelivery = uConfigPrior1;
       LiveProfileContentAreaHeightService$ConfigPriority[] uConfigPrior2 = new LiveProfileContentAreaHeightService$ConfigPriority[]{uConfigPrior,uConfigPrior1};
       LiveProfileContentAreaHeightService$ConfigPriority.$VALUES = uConfigPrior2;
    }
    public void LiveProfileContentAreaHeightService$ConfigPriority(String p0,int p1){
       super(p0, p1);
    }
    public static LiveProfileContentAreaHeightService$ConfigPriority valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveProfileContentAreaHeightService$ConfigPriority.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveProfileContentAreaHeightService$ConfigPriority.class, p0);
    }
    public static LiveProfileContentAreaHeightService$ConfigPriority[] values(){
       Object obj = PatchProxy.apply(null, null, LiveProfileContentAreaHeightService$ConfigPriority.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveProfileContentAreaHeightService$ConfigPriority.$VALUES.clone();
    }
}
